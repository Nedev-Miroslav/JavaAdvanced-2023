package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Deque<Integer> stack = new ArrayDeque<>();


        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (current == '(') {
                stack.push(i);
            } else if (current == ')') {
                int poppingIndex = stack.pop();
                String subString = input.substring(poppingIndex, i + 1);
                System.out.println(subString);
            }


        }

    }
}
