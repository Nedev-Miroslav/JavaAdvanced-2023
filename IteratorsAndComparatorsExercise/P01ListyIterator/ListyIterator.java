package IteratorsAndComparatorsExercise.P01ListyIterator; // При събмит трябва да се премахне Package

import java.util.List;

public class ListyIterator {
    private List<String> elements;
    private int index;


    public ListyIterator(String... elements) {
        this.elements = List.of(elements);
        this.index = 0;
    }

    public boolean move() {
        if (hasNext()) {
            index++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        if (index < elements.size() - 1) {
            return true;
        }
        return false;
    }

    public void print() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        }
        System.out.println(this.elements.get(index));
    }


}
