package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P03DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimalNum = Integer.parseInt(scanner.nextLine());

        Deque<Integer> stack  = new ArrayDeque<>();

        if(decimalNum == 0) {
            System.out.println(0);
            return;
        }

        while (decimalNum > 0) {

            stack.push(decimalNum % 2);
            decimalNum /= 2;



        }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }

    }
}
 // Друго подобно решение
//package StacksAndQueues;
//
//        import java.util.ArrayDeque;
//        import java.util.Scanner;
//
//public class P03DecimalToBinaryConverter {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        ArrayDeque<Integer> binaryStack = new ArrayDeque<>();
//
//        int decimal = Integer.parseInt(scanner.nextLine());
//        if (decimal == 0) {
//            System.out.println(0);
//            return;
//        }
//        while (decimal != 0) {
//
//
//            int oneOrZero = decimal % 2;
//
//            binaryStack.push(oneOrZero);
//
//            decimal = decimal / 2;
//
//        }
//
//  //      for (Integer integer : binaryStack) {
//  //          System.out.print(integer);
//  //      }
//        while (!binaryStack.isEmpty()) {
//            System.out.print(binaryStack.pop());
//        }
//
//
//    }
//}
