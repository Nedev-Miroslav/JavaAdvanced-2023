package IteratorsAndComparatorsExercise.P04Froggy; // При събмит трябва да се премахне Package

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    private List<Integer> number;


    public Lake(Integer... number) {
        this.number = List.of(number);


    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private class Frog implements Iterator<Integer> {
        private int count = 0;

        private boolean isFirst = false;

        @Override
        public boolean hasNext() {

            return count < number.size();


        }

        @Override
        public Integer next() {
            Integer element = number.get(count);
            count += 2;
            if (count >= number.size() && !isFirst) {
                isFirst = true;
                count = 1;


            }
            return element;
        }
    }


}
