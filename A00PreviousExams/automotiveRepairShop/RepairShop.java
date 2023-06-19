package A00PreviousExams.automotiveRepairShop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RepairShop {


    private int capacity;
    private List<Vehicle> vehicles;

    public RepairShop(int capacity) {
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }


    public void addVehicle(Vehicle vehicle) {
        if (vehicles.size() < capacity) {
            vehicles.add(vehicle);
        }

    }

    public boolean removeVehicle(String vin) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVIN().equals(vin)) {
                this.vehicles.remove(vehicle);
                return true;
            }
        }
        return false;
    }

    public int getCount() {
        return vehicles.size();
    }

    public Vehicle getLowestMileage() {
        return this.vehicles.stream().min(Comparator.comparingInt(Vehicle::getMileage)).get();

    }

    public String report() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Vehicles in the preparatory:"));
        for (Vehicle vehicle : vehicles) {
            sb.append(System.lineSeparator());
            sb.append(vehicle);
        }
        return sb.toString();
    }

}
