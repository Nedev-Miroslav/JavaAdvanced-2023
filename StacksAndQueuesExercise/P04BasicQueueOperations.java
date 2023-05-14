package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//            второ решение на задачата при него n не се използва, но работи!
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(queue::offer);

        for (int i = 0; i < s; i++) {
            if (!queue.isEmpty()) {
                queue.poll();
            }
        }

        if (queue.isEmpty()) {
            System.out.println(0);
            return;
        }
        if (queue.contains(x)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(queue));
        }


//        Първо решение на задачата
//        ArrayDeque<Integer> queue = new ArrayDeque<>();
//
//        int n = scanner.nextInt();
//        int s = scanner.nextInt();
//        int x = scanner.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            int currentNum = scanner.nextInt();
//            queue.offer(currentNum);
//        }
//        for (int i = 1; i <= s; i++) {
//            if (!queue.isEmpty()) {
//                queue.poll();
//            }
//        }
//
//        if (queue.isEmpty()) {
//            System.out.println(0);
//            return;
//        }
//        if (queue.contains(x)) {
//            System.out.println("true");
//        } else {
//            System.out.println(Collections.min(queue));
//        }

    }
}