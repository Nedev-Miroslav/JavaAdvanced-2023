package GenericsExercise.P01GenericBox; // При събмит да се премахне package!

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> boxes;

    public Box() {
        this.boxes = new ArrayList<>();

    }

    public void addElement(T element) {
        boxes.add(element);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T box : boxes) {
            sb.append(String.format("%s: %s", box.getClass().getName(), box.toString())).append(System.lineSeparator());
        }
        return sb.toString();


    }
}
