package IteratorsAndComparatorsExercise.P03StackIterator; // При събмит трябва да се премахне Package

import java.util.Iterator;
import java.util.function.Consumer;

public class StackIterator implements Iterable<Integer> {
    private Integer[] elements;
    private int currentIndex;

    public StackIterator() {
        this.elements = new Integer[20];
        this.currentIndex = 0;
    }

    public void push(int element) {
        this.elements[this.currentIndex++] = element;
    }

    public Integer pop() {
        try {
            Integer element = this.elements[this.currentIndex - 1];
            this.elements[this.currentIndex - 1] = null;
            this.currentIndex--;
            return element;

        } catch (ArrayIndexOutOfBoundsException exception) {
            throw new IllegalArgumentException("No elements");
        }
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new cusIterator();
    }

    private class cusIterator implements Iterator<Integer> {
        private int count = currentIndex;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Integer next() {

            return elements[--count];

        }
    }
}
