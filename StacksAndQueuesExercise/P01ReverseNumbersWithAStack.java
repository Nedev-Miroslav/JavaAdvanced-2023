package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01ReverseNumbersWithAStack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//      решение 3 пълнене на стека направо
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(stack::push);


        for (Integer integer : stack) {
            System.out.printf("%d ", stack.pop());
        }


//        ArrayDeque<Integer> stack = new ArrayDeque<>();
//
//        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//
//        for (int elements : input) {
//            stack.push(elements);
//        }
//
//
//
//        Решение 2 за принтиране се използва Iterator който ще принтира докато stack има елементи в себеси
//        for (Integer integer : stack) {
//            System.out.printf("%d ", stack.pop());
//        }


//         Решение 1 със станда while за принтиране
//        while (!stack.isEmpty()) {
//            System.out.printf("%d ", stack.pop());
//        }


    }
}
