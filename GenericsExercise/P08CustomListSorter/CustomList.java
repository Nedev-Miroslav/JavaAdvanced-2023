package GenericsExercise.P08CustomListSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    private List<T> data;

    public CustomList() {
        this.data = new ArrayList<>();

    }



    public List<T> getData() {
        return data;
    }

    public void add(T element) {
        this.data.add(element);

    }

    public T remove(int index) {
        if (index >= 0 && index < data.size()) {
            return data.remove(index);
        } else {
            return null;
        }
    }

    public boolean contains(T element) {
        for (T t : data) {
            if (t.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void swap(int index1, int index2) {
        Collections.swap(data, index1, index2);

    }

    public int countGreaterThan(T element) {
        int count = 0;

        for (T t : data) {
            if (t.compareTo(element) > 0) {
                count++;
            }
        }
        return count;

    }

    public T getMax() {
        return Collections.max(data);

    }

    public T getMin(){
        return Collections.min(data);

    }



        @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : data) {
            sb.append(t).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
