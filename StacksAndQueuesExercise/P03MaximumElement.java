package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String [] command = scanner.nextLine().split("\\s+");
            int numOfCommand = Integer.parseInt(command[0]);
            if (numOfCommand == 1) {
                int element = Integer.parseInt(command[1]);
                stack.push(element);
            } else if (numOfCommand == 2) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (numOfCommand == 3) {
                System.out.println(Collections.max(stack));
            }

        }


    }
}
