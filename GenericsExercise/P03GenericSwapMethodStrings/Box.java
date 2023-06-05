 package GenericsExercise.P03GenericSwapMethodStrings; // При събмит да се премахне package!


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

    public void swapElement(int first, int second) {
        T firstElement = boxes.get(first);
        T secondElement = boxes.get(second);
        T temp = firstElement;

        firstElement = secondElement;
        secondElement = temp;
        boxes.set(first, firstElement);
        boxes.set(second, secondElement);

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