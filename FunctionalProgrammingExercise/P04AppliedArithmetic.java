package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class P04AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();


        UnaryOperator<List<Integer>> addFunc = list -> list.stream().map(e -> e += 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiplyFunc = list -> list.stream().map(e -> e *= 2).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtractFunc = list -> list.stream().map(e -> e -= 1).collect(Collectors.toList());
        Consumer<List<Integer>> printing = e -> e.forEach( n -> System.out.print(n + " "));


        while (!command.equals("end")) {

            switch (command) {
                case "add":
                    numberList = addFunc.apply(numberList);

                    break;

                case "multiply":
                    numberList = multiplyFunc.apply(numberList);

                    break;

                case "subtract":
                    numberList = subtractFunc.apply(numberList);

                    break;

                case "print":
                    printing.accept(numberList);
                    System.out.println();

                    break;

            }


            command = scanner.nextLine();
        }


    }
}
