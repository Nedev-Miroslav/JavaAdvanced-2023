package IteratorsAndComparatorsExercise.P02Collection; // При събмит трябва да се премахне Package



import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
       ListyIterator listyIterator = new ListyIterator();


        while (!input.equals("END")) {
            String[] line = input.split("\\s+");
            String command = input.split("\\s+")[0];


            switch (command) {
                case "Create":
                    if (line.length > 1) {
                        String[] currentLine = Arrays.copyOfRange(line, 1, line.length);
                        listyIterator = new ListyIterator(currentLine);
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;

                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;


                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalStateException exception) {
                        System.out.println(exception.getMessage());
                    }

                    break;
                case "PrintAll":

                    listyIterator.forEach(s -> System.out.print(s + " "));
                    System.out.println();
                    break;

            }


            input = scanner.nextLine();
        }


    }
}

