package A00PreviousExams.shelter;

import java.util.ArrayList;
import java.util.List;

public class Shelter {

    private List<Animal> data;
    private int capacity;


    public Shelter(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();

    }

    public void add(Animal animal) {
        if (this.data.size() < this.capacity) {
            data.add(animal);
        }
    }

    public boolean remove(String name) {
        for (Animal animal : data) {
            if (animal.getName().equals(name)) {
                data.remove(animal);
                return true;
            }
        }
        return false;
    }

    public Animal getAnimal(String name, String caretaker) {
        for (Animal animal : data) {
            if (animal.getName().equals(name) && animal.getCaretaker().equals(caretaker)) {
                return animal;
            }
        }
        return null;
    }

    public Animal getOldestAnimal() {
        int oldest = 0;
        Animal toReturn = null;

        for (Animal animal : data) {
            if (animal.getAge() > oldest) {
                oldest = animal.getAge();
                toReturn = animal;
            }

        }
        return toReturn;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("The A00PreviousExams.shelter has the following animals:").append(System.lineSeparator());
        for (Animal animal : data) {
            sb.append(String.format("%s %s", animal.getName(), animal.getCaretaker())).append(System.lineSeparator());
        }
        return sb.toString();
    }


}
