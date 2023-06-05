package DefiningClassesExercise.P04RawData;

public class Car {
    private String model;
    private Engine engine;

    private Cargo cargo;

    private Tire tire;


    public Car(String model, Engine engine, Cargo cargo, Tire tire) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tire = tire;
    }

    public boolean isLow() {
        if (this.tire.lowPressure()) {
            return true;
        }
        return false;
    }

    public boolean isPower() {
        if (this.engine.isPowerEnough()) {
            return true;
        }
        return false;
    }

}
