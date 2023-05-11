package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArr = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(scanner.nextLine());

        Deque<String> queue = new ArrayDeque<>();

        Collections.addAll(queue, inputArr);


        while (queue.size() != 1) {
        for (int i = 1; i < n; i++) {

                String name = queue.poll();
                queue.offer(name);


            }
            System.out.printf("Removed %s%n", queue.poll());

        }
        System.out.printf("Last is %s%n", queue.poll());


    }
}
