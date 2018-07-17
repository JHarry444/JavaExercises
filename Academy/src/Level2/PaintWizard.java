package Level2;

public enum PaintWizard {

    CHEAPOMAX (20, 19.99, 10), AVERAGEJOES(15, 17.99, 11), DULUXOUROUSPAINTS(10, 25, 20);

    private int litres;
    private double price;
    private int coverage;

    PaintWizard(int litres, double price, int coverage) {
        this.litres = litres;
        this.price = price;
        this.coverage = coverage;
    }
}
