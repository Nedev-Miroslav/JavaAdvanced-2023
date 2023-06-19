package A00PreviousExams.kindergarten;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kindergarten {

    private String name;
    private int capacity;
    private List<Child> registry;


    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public boolean addChild(Child child) {
        if (this.registry.size() < this.capacity) {
            this.registry.add(child);
            return true;
        }
        return false;

    }

    public boolean removeChild(String firstName) {
        for (Child child : registry) {
            if (child.getFirstName().equals(firstName)) {
                this.registry.remove(child);
                return true;
            }
        }
        return false;

    }


    public int getChildrenCount() {
        return this.registry.size();

    }

    public Child getChild(String firstName) {
        for (Child child : registry) {
            if (child.getFirstName().equals(firstName)) {
                return child;
            }

        }
        return null;
    }

    public String registryReport() {
        registry.sort(Comparator.comparing(Child::getAge).thenComparing(Child::getFirstName).thenComparing(Child::getLastName));
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Registered children in %s:", this.getName()));

        for (Child child : registry) {
            sb.append(System.lineSeparator());
            sb.append("--").append(System.lineSeparator());
            sb.append(child);
        }

        return sb.toString();
    }


}


