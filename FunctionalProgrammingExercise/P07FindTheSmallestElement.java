package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        //  Решение на един ред
        Function<List<Integer>, Integer> func = e -> e.lastIndexOf(Collections.min(e));

        // моето малко по-тромаво, но работещо решение 
//        Function<List<Integer>, Integer> func = e -> {
//            int n = Integer.MAX_VALUE;
//            int index = -1;
//            for (int i = 0; i < e.size(); i++) {
//                if (e.get(i) <= n) {
//                    n = e.get(i);
//                    index = i;
//                }
//            }
//
//            return index;
//        };
        Consumer<Integer> toPrint = e -> System.out.println(e);
        toPrint.accept(func.apply(numberList));

    }
}
