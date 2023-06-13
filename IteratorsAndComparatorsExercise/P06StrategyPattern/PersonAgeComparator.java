package IteratorsAndComparatorsExercise.P06StrategyPattern; // При събмит трябва да се премахне Package

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        return first.getAge() - second.getAge();
    }
}
