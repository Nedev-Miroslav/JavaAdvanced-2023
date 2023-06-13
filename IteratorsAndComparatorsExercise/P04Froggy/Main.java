package IteratorsAndComparatorsExercise.P04Froggy; // При събмит трябва да се премахне Package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("END")) {
            String[] line = input.split(", ");
           Integer[] current = Arrays.stream(line).map(Integer::parseInt).toArray(Integer[]::new);
            Lake lake = new Lake(current);
            List<String> result = new ArrayList<>();
            for (Integer number : lake) {
                result.add(String.valueOf(number));
            }

            System.out.println(String.join(", ", result));

            input = scanner.nextLine();
        }



    }
}
