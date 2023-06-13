package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .map(Integer::parseInt)
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());


        System.out.println(list.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(", ")));
        System.out.println(list.stream().sorted().map(e -> String.valueOf(e)).collect(Collectors.joining(", ")));


    }
}
