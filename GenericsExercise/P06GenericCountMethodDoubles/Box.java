package GenericsExercise.P06GenericCountMethodDoubles; // При събмит да се премахне package!

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> boxes;

    public Box() {
        this.boxes = new ArrayList<>();

    }

    public void addElement(T element) {

        boxes.add(element);
    }

    public void swapElement(int first, int second) {
        T firstElement = boxes.get(first);
        T secondElement = boxes.get(second);
        T temp = firstElement;

        firstElement = secondElement;
        secondElement = temp;
        boxes.set(first, firstElement);
        boxes.set(second, secondElement);

    }

    public int compareElement(T element) {
        int count = 0;

        for (T t : boxes) {
            if (t.compareTo(element) > 0) {
                count++;
            }
        }

        return count;


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