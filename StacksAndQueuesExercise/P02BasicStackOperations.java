package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int currentNum = scanner.nextInt();
            stack.push(currentNum);
        }
        for (int i = 1; i <= s; i++) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println(0);
            return;
        }
        if (stack.contains(x)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(stack));
        }

    }
}
