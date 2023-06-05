package DefiningClassesExercise.P04RawData;

public class Engine {
    private int engineSpeed;
    private int enginePower;

    public Engine(int engineSpeed, int enginePower) {
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }

    public boolean isPowerEnough() {
        if (enginePower > 250) {
            return true;
        }
        return false;
    }


}
