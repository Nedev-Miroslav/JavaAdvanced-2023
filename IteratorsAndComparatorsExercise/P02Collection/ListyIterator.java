package IteratorsAndComparatorsExercise.P02Collection; // При събмит трябва да се премахне Package

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListyIterator implements Iterable<String>{
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

    @Override
    public void forEach(Consumer<? super String> action) {
        this.elements.forEach(action);
    }

    @Override
    public Iterator<String> iterator() {
        return new lisIter();
    }

    public class lisIter implements Iterator<String> {

        private int count = 0;
        @Override
        public boolean hasNext() {
            return count < elements.size();
        }

        @Override
        public String next() {
           return elements.get(index++);
        }
    }
}
