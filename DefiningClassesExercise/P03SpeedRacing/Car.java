package DefiningClassesExercise.P03SpeedRacing;

public class Car {

    private String model;
    private double fuelAmount;
    private double consumption;
    private int distance;

    public Car(String model, double fuelAmount, double consumption) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.consumption = consumption;
        this.distance = 0;
    }

    public boolean canDrive (int km) {
        double neededFuel = this.consumption * km;
        if(neededFuel <= this.fuelAmount){
            this.fuelAmount -= neededFuel;
            distance += km;
            return true;
        } else {
            return false;
        }


    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", model, fuelAmount, distance);
    }
}

