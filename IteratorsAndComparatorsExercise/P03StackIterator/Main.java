package IteratorsAndComparatorsExercise.P03StackIterator; // При събмит трябва да се премахне Package

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StackIterator stack = new StackIterator();
        while (!input.equals("END")) {
            String[] tokens = input.split("[\\s,]+");
            switch (tokens[0]) {
                case "Push":
                    for (int i = 1; i < tokens.length; i++) {
                        stack.push(Integer.parseInt(tokens[i]));
                    }
                    break;
                case "Pop":
                    try {
                        stack.pop();
                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;


            }


            input = scanner.nextLine();
        }

        stack.forEach(s -> System.out.println(s));
        stack.forEach(s -> System.out.println(s));
    }
}
