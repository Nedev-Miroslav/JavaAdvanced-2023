package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P06RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Long> stack = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        stack.push(1L);
        stack.push(1L);

        for (int i = 1; i < n; i++) {

            long num1 = stack.pop();
            long num2 = stack.pop();

            long sum = num1 + num2;


            stack.push(num1);
            stack.push(sum);


        }

        System.out.println(stack.peek());


    }
}
