package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Function<String, Integer> parse = s -> Integer.parseInt(s);

        List<Integer> list = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .map(e -> parse.apply(e))
                .collect(Collectors.toList());


        int sum = list
                .stream()
                .mapToInt(a -> a) // това а -> а се нарича identity function
                .sum();

        System.out.printf("Count = %d%n", list.size());
        System.out.printf("Sum = %d%n", sum);


    }
}
