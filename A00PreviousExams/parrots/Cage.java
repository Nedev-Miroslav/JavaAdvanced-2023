package A00PreviousExams.parrots;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String name;
    private int capacity;
    private List<Parrot> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Parrot parrot) {
        if (this.data.size() < this.capacity) {
            this.data.add(parrot);
        }
    }

    public boolean remove(String name) {
        for (Parrot parrot : data) {
            if (parrot.getName().equals(name)) {
                this.data.remove(parrot);
                return true;
            }
        }
        return false;
    }

    public Parrot sellParrot(String name) {
        for (Parrot parrot : data) {
            if (parrot.getName().equals(name)) {
                parrot.setAvailable(false);
                return parrot;
            }
        }
        return null;

    }


    public List<Parrot> sellParrotBySpecies(String species) {
        List<Parrot> toReturn = new ArrayList<>();
        for (Parrot parrot : data) {
            if (parrot.getSpecies().equals(species)) {
                parrot.setAvailable(false);
                toReturn.add(parrot);
            }
        }
        return toReturn;
    }


    public int count() {

        return this.data.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Parrots available at %s:", this.name)).append(System.lineSeparator());
        for (Parrot parrot : data) {

            if (parrot.isAvailable()) {
                sb.append(parrot).append(System.lineSeparator());
            }

        }
        return sb.toString().trim();
    }


}
