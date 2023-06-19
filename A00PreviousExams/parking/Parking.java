package A00PreviousExams.parking;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Parking {
    private List<Car> data;
    private String type;
    private int capacity;

    public Parking(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }


    public void add(Car car) {
        if (this.data.size() < capacity) {
            data.add(car);
        }

    }


    public boolean remove(String manufacturer, String model) {
        for (Car car : data) {
            if (car.getManufacturer().equals(manufacturer) && car.getModel().equals(model)) {
                this.data.remove(car);
                return true;
            }
        }
        return false;
    }
    // Метода remove със stream.
    //  public boolean remove(String manufacturer, String model) {
    //        return this.data.removeIf(car -> car.getManufacturer().equals(manufacturer)
    //                                         && car.getModel().equals(model));
    //    }


    public Car getLatestCar() {
        return this.data.stream().max(Comparator.comparingInt(Car::getYear)).orElse(null);

    }



    public Car getCar(String manufacturer, String model) {
        for (Car car : data) {
            if (car.getManufacturer().equals(manufacturer) && car.getModel().equals(model)) {
                return car;
            }
        }
        return null;
    }
    // Методът getCar със stream
    // public Car getCar(String manufacturer, String model) {
    //        return this.data.stream()
    //                        .filter(car -> car.getManufacturer().equals(manufacturer) &&
    //                                       car.getModel().equals(model))
    //                        .findFirst()
    //                        .orElse(null);
    //    }

    public int getCount() {
        return data.size();
    }


    public String getStatistics() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("The cars are parked in %s:", this.type));
        for (Car car : data) {
            sb.append(System.lineSeparator());
            sb.append(car);
        }
        return sb.toString();
    }


}
