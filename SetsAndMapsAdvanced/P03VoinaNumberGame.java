package SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashSet<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int count = 50;
        while (count-- > 0) {

            int firstCart = firstDeck.iterator().next();
            firstDeck.remove(firstCart);

            int secondCart = secondDeck.iterator().next();
            secondDeck.remove(secondCart);

            if (firstCart > secondCart) {
                firstDeck.add(firstCart);
                firstDeck.add(secondCart);
            } else if (secondCart > firstCart) {
                secondDeck.add(firstCart);
                secondDeck.add(secondCart);
            }


            if (firstDeck.isEmpty() || secondDeck.isEmpty()) {
                break;
            }


        }

        if (firstDeck.size() > secondDeck.size()) {
            System.out.println("First player win!");
        } else if (secondDeck.size() > firstDeck.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }


    }
}


// Мое Решение
// package SetsAndMapsAdvanced;
//
//import java.util.LinkedHashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class P03VoinaNumberGame {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String[] first = scanner.nextLine().split(" ");
//        String[] second = scanner.nextLine().split(" ");
//
//        Set<Integer> firstDeck = new LinkedHashSet<>();
//        Set<Integer> secondDeck = new LinkedHashSet<>();
//
//
//        for (int i = 0; i < first.length; i++) {
//
//            int current1 = Integer.parseInt(first[i]);
//            firstDeck.add(current1);
//        }
//
//        for (int i = 0; i < second.length; i++) {
//
//            int current2 = Integer.parseInt(second[i]);
//            secondDeck.add(current2);
//        }
//
//
//        for (int i = 1; i <= 50; i++) {
//
//            int firstCart = firstDeck.iterator().next();
//            firstDeck.remove(firstCart);
//
//            int secondCart = secondDeck.iterator().next();
//            secondDeck.remove(secondCart);
//
//            if (firstCart > secondCart) {
//                firstDeck.add(firstCart);
//                firstDeck.add(secondCart);
//            } else if (secondCart > firstCart) {
//                secondDeck.add(firstCart);
//                secondDeck.add(secondCart);
//            }
//
//
//            if (firstDeck.isEmpty() || secondDeck.isEmpty()) {
//                break;
//            }
//
//
//        }
//
//        if (firstDeck.size() > secondDeck.size()) {
//            System.out.println("First player win!");
//        } else if (secondDeck.size() > firstDeck.size()) {
//            System.out.println("Second player win!");
//        } else {
//            System.out.println("Draw!");
//        }
//
//
//    }
//}