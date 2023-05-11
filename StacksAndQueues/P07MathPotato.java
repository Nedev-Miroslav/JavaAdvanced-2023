package StacksAndQueues;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> queue = new PriorityQueue<>();

        Collections.addAll(queue, input);

        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {

                String name = queue.poll();
                queue.offer(name);


            }

            if (!isPrimeNum(cycle) && cycle != 1) {
                System.out.printf("Prime %s%n", queue.peek());
            } else {
                System.out.printf("Removed %s%n", queue.poll());
            }

            cycle++;


        }
        System.out.printf("Last is %s%n", queue.peek());


    }

    public static boolean isPrimeNum(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return true;
            }

        }

        return false;

    }

}

// Моето решение с моя метод
//package StacksAndQueues;
//import java.util.ArrayDeque;
//import java.util.Collections;
//import java.util.PriorityQueue;
//import java.util.Scanner;
//
//public class P07MathPotato {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String[] input = scanner.nextLine().split("\\s+");
//        int n = Integer.parseInt(scanner.nextLine());
//
//        PriorityQueue<String> queue = new PriorityQueue<>();
//
//        Collections.addAll(queue, input);
//
//        int cycle = 1;
//        while (queue.size() > 1) {
//            for (int i = 1; i < n; i++) {
//
//                String name = queue.poll();
//                queue.offer(name);
//
//
//            }
//
//            if (!isPrimeNum(cycle) && cycle != 1) {
//                System.out.printf("Prime %s%n", queue.peek());
//            } else {
//                System.out.printf("Removed %s%n", queue.poll());
//            }
//
//            cycle++;
//
//
//        }
//        System.out.printf("Last is %s%n", queue.peek());
//
//
//    }
//
//    public static boolean isPrimeNum(int num) {
//        int counter = 0;
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                counter++;
//            }
//
//        }
//        if (counter > 2) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//}
