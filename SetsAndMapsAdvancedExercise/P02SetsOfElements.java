package SetsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();


        for (int first = 1; first <= n; first++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            set1.add(currentNum);

        }


        for (int second = 1; second <= m; second++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            set2.add(currentNum);

        }

        set1.retainAll(set2);
        for (Integer num : set1) {
            System.out.printf("%d ", num);
        }


    }
}

// Второ решение
// String[] input = scanner.nextLine().split("\\s+");
//
//        int n = Integer.parseInt(input[0]);
//        int m = Integer.parseInt(input[1]);
//
//        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
//        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
//
//
//        for (int first = 1; first <= n; first++) {
//            int currentNum = Integer.parseInt(scanner.nextLine());
//            set1.add(currentNum);
//
//        }
//
//
//        for (int second = 1; second <= m; second++) {
//            int currentNum = Integer.parseInt(scanner.nextLine());
//            set2.add(currentNum);
//
//        }
//
//
//        for (Integer integer : set1) {
//            if(set2.contains(integer)) {
//                System.out.printf("%d ", integer);
//            }
//        }
//
//
//    }
//
//}