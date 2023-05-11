package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("\\s+");

        Deque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack, input);

            while (stack.size() > 1) {
                int firstNum = Integer.parseInt(stack.pop());
                String operator = stack.pop();
                int secondNum = Integer.parseInt(stack.pop());

                if (operator.equals("+")) {
                   stack.push(firstNum + secondNum + "");
                } else if (operator.equals("-")) {
                    stack.push(firstNum - secondNum + "");
                }

            }
        System.out.println(stack.peek());
    }
}

// рещение с addAll
//package StacksAndQueues;
//
//        import java.util.ArrayDeque;
//        import java.util.Collections;
//        import java.util.Scanner;
//
//public class P02SimpleCalculator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String[] input = scanner.nextLine().split("\\s+");
//        ArrayDeque<String> elementStack = new ArrayDeque<>();
//        Collections.addAll(elementStack, input);
//
//        int sum = 0;
//
//        while (elementStack.size() > 1) {
//            int firstElement = Integer.parseInt(elementStack.pop());
//            String operator = elementStack.pop();
//            int secondElement = Integer.parseInt(elementStack.pop());
//
//
//            if (operator.equals("+")) {
//                sum = firstElement + secondElement;
//            } else if (operator.equals("-")) {
//                sum = firstElement - secondElement;
//            }
//            elementStack.push(String.valueOf(sum));
//
//        }
//        System.out.println(sum);
//
//    }
//}



// Решение с add
//package StacksAndQueues;
//
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class P02SimpleCalculator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String[] input = scanner.nextLine().split("\\s+");
//        ArrayDeque<String> elementStack = new ArrayDeque<>();
//
//        for (int i = 0; i < input.length; i++) {
//            String current = input[i];
//            elementStack.add(current);
//        }
//
//        int sum = 0;
//
//        while (elementStack.size() > 1) {
//            int firstElement = Integer.parseInt(elementStack.pop());
//            String operator = elementStack.pop();
//            int secondElement = Integer.parseInt(elementStack.pop());
//
//
//            if (operator.equals("+")) {
//                sum = firstElement + secondElement;
//            } else if (operator.equals("-")) {
//                sum = firstElement - secondElement;
//            }
//            elementStack.push(String.valueOf(sum));
//
//        }
//        System.out.println(sum);
//
//    }
//}

