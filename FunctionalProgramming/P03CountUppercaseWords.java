package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> isUpper = letter -> Character.isUpperCase(letter.charAt(0));

        List<String> startWithUpperCaseList = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .filter(w -> isUpper.test(w))
                .collect(Collectors.toList());

        Consumer<String> toPrint = words -> System.out.println(words);

        System.out.println(startWithUpperCaseList.size());

        startWithUpperCaseList.forEach(str -> toPrint.accept(str));


    }
}
