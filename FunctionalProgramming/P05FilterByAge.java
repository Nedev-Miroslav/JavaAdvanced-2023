package FunctionalProgramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P05FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split(", ");
            map.put(input[0], Integer.parseInt(input[1]));

        }

        String condition = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<Integer> filter = getPredicate(condition, ageLimit);
        Consumer<Map.Entry<String, Integer>> print = getPrintConsumer(format);

        map
                .entrySet()
                .stream()
                .filter(e -> filter.test(e.getValue()))
                .forEach(e -> print.accept(e));

    }

    private static Consumer<Map.Entry<String, Integer>> getPrintConsumer(String format) {
        if (format.equals("name")) {
            return e -> System.out.println(e.getKey());
        } else if (format.equals("age")) {
            return e -> System.out.println(e.getValue());
        } else {
            return e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue());
        }
    }

    private static Predicate<Integer> getPredicate(String condition, int ageLimit) {
        if (condition.equals("older")) {
            return x -> x >= ageLimit;
        } else {
            return x -> x < ageLimit;
        }
    }
}
