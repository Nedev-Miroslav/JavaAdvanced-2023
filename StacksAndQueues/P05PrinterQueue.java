package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P05PrinterQueue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deque<String> queue = new ArrayDeque<>();

        String command = scanner.nextLine();

        while (!command.equals("print")) {

            if (command.equals("cancel")) {

                if (!queue.isEmpty()) {
                    System.out.printf("Canceled %s%n", queue.poll());
                } else {
                    System.out.println("Printer is on standby");
                }

            } else {
                queue.offer(command);

            }


            command = scanner.nextLine();
        }


        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
