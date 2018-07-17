package Level2;

import java.util.*;

public enum PaintWizard {

    CHEAPOMAX(20, 19.99, 10) {

    }, AVERAGEJOES(15, 17.99, 11), DULUXOUROUSPAINTS(10, 25, 20);

    private int litres;
    private double price;
    private int coverage;

    PaintWizard(int litres, double price, int coverage) {
        this.litres = litres;
        this.price = price;
        this.coverage = coverage;
    }

    public int getTotalCoverage() {
        return this.litres * this.coverage;
    }

    private double priceForRoom(int size) {
        return  Math.round(size / this.getTotalCoverage()) * this.price; //tins needed * price
    }

    public static PaintWizard findLeastWasteful(int squareFootage) {
        int cheapoWaste = CHEAPOMAX.getTotalCoverage() > squareFootage ? CHEAPOMAX.getTotalCoverage() % squareFootage : squareFootage % CHEAPOMAX.getTotalCoverage();
        int averageWaste = AVERAGEJOES.getTotalCoverage() > squareFootage ? AVERAGEJOES.getTotalCoverage() % squareFootage : squareFootage % AVERAGEJOES.getTotalCoverage();
        int duluxWaste = DULUXOUROUSPAINTS.getTotalCoverage() > squareFootage ? DULUXOUROUSPAINTS.getTotalCoverage() % squareFootage : squareFootage % DULUXOUROUSPAINTS.getTotalCoverage();
        if (cheapoWaste < averageWaste && cheapoWaste < duluxWaste) {
            return CHEAPOMAX;
        } else if (averageWaste < cheapoWaste && averageWaste < duluxWaste) {
            return AVERAGEJOES;
        } else if (duluxWaste < cheapoWaste && duluxWaste < averageWaste) {
            return  DULUXOUROUSPAINTS;
        } else {
            return CHEAPOMAX;
        }
    }

    public static PaintWizard findCheapest(int size) {
        double cheapPrice = CHEAPOMAX.priceForRoom(size);
        double averagePrice = AVERAGEJOES.priceForRoom(size);
        double duluxPrice = DULUXOUROUSPAINTS.priceForRoom(size);
        if (cheapPrice < averagePrice && cheapPrice < duluxPrice) {
            return CHEAPOMAX;
        } else if (averagePrice < cheapPrice && averagePrice < duluxPrice) {
            return AVERAGEJOES;
        } else if (duluxPrice < cheapPrice && duluxPrice < averagePrice) {
            return DULUXOUROUSPAINTS;
        } else {
            return CHEAPOMAX;
        }
    }
}
