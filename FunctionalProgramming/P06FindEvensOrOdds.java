package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class P06FindEvensOrOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int lowerBound = Integer.parseInt(input[0]);
        int upperBound = Integer.parseInt(input[1]);

        String oddOrEven = scanner.nextLine();

        Predicate<Integer> filter = oddOrEven.equals("odd") ? x -> x % 2 != 0 : x -> x % 2 == 0;

        // ако използвам IntStream.range (upperBound + 1) тъй като последния елемент не е включен
        // rangeClosed включва и последния елемент
        IntStream.rangeClosed(lowerBound, upperBound)
                .filter(n -> filter.test(n))
                .forEach(e -> System.out.print(e + " "));


    }
}
