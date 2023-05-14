package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Character> stack = new ArrayDeque<>();

        String input = scanner.nextLine();
        boolean areBalanced = true;
        for (char bracket : input.toCharArray()) {


            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == '}' || bracket == ']') {


                if (bracket == ')' && !stack.isEmpty() && stack.pop() == '(') {
                    areBalanced = true;

                } else if (bracket == '}' && !stack.isEmpty() && stack.pop() == '{') {
                    areBalanced = true;

                } else if (bracket == ']' && !stack.isEmpty() && stack.pop() == '[') {
                    areBalanced = true;
                } else {
                    areBalanced = false;
                    break;
                }
            }

        }
        String outPut = areBalanced ? "YES" : "NO";
        System.out.println(outPut);


    }
}
