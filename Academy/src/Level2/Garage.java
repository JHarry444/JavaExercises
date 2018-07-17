package Level2;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehicle> vehicles;

    public Garage(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void removeVehicleByType(Class vehicleType) {
        List<Vehicle> toRemove = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getClass().equals(vehicleType))
                toRemove.add(vehicle);
        }
        this.vehicles.removeAll(toRemove);
    }

    public void removeVehicleByID(String ID) {
        List<Vehicle> toRemove = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.id.equals(ID))
                toRemove.add(vehicle);
        }
        this.vehicles.removeAll(toRemove);
    }

    public void emptyGarage() {
        this.vehicles.clear();
    }

    public int fixVehicle(Vehicle vehicle) {
        if (vehicle instanceof Motorbike)
            return 1;
        if (vehicle instanceof Car)
            return 3;
        if (vehicle instanceof Lorry)
            return 5;
        return 0;
    }

    public int calcTotalPrice() {
        int price = 0;
        for (Vehicle vehicle : vehicles) {
            price += fixVehicle(vehicle);
        }
        return price;
    }
}
