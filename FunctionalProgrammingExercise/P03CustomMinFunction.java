package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Друго решение
        Integer[] intArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Function<Integer[], Integer> func = e -> Arrays.stream(e)
                .mapToInt(num -> num)
                .min()
                .getAsInt();

//        Моето Решение
//        Function<Integer[], Integer> func = e -> {
//            int n = Integer.MAX_VALUE;
//            for (int i = 0; i < e.length; i++) {
//                if (e[i] < n) {
//                    n = e[i];
//                }
//            }
//
//            return n;
//        };
//
//        String[] input = scanner.nextLine().split("\\s+");
//        Integer[] intArr = new Integer[input.length];
//        for (int i = 0; i < input.length; i++) {
//            int current = Integer.parseInt(input[i]);
//            intArr[i] = current;
//        }

        System.out.println(func.apply(intArr));

    }
}
