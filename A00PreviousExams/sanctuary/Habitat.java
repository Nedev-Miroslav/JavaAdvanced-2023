package A00PreviousExams.sanctuary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Habitat {

    private List<Elephant> data;
    private int capacity;

    public Habitat(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Elephant elephant) {
        if (data.size() < this.capacity) {
            data.add(elephant);
        }
    }

    public boolean remove(String name) {
        for (Elephant elephant : data) {
            if (elephant.getName().equals(name)) {
                data.remove(elephant);
                return true;
            }
        }
        return false;
    }

    public Elephant getElephant(String retiredFrom) {
        for (Elephant elephant : data) {
            if (elephant.getRetiredFrom().equals(retiredFrom)) {
                return elephant;
            }
        }
        return null;
    }

    public Elephant getOldestElephant() {
        return this.data.stream()
                .sorted((c1, c2) -> Integer.compare(c2.getAge(), c1.getAge()))
                .collect(Collectors.toList())
                .get(0);
    }

    public int getAllElephants() {
        return data.size();
    }

    public String getReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Saved elephants in the park:");
        for (Elephant datum : data) {
            sb.append(System.lineSeparator());
            sb.append(String.format("%s came from: %s", datum.getName(), datum.getRetiredFrom()));
        }


        return sb.toString();
    }
}
