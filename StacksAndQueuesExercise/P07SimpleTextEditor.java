package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();

            if (command.startsWith("1")) {
                stack.push(sb.toString());
                String text = command.split("\\s+")[1];
                sb.append(text);


            } else if (command.startsWith("2")) {
                stack.push(sb.toString());
                int removedElementsCounts = Integer.parseInt(command.split("\\s+")[1]);
                int starIndex = sb.length() - removedElementsCounts;
                int endIndex = starIndex + removedElementsCounts;
                sb.delete(starIndex, endIndex);


            } else if (command.startsWith("3")) {

                int elementToReturn = Integer.parseInt(command.split("\\s+")[1]);
                String toPrint = sb.toString();
                System.out.println(toPrint.charAt(elementToReturn - 1));


            } else if (command.equals("4")) {

                if (!stack.isEmpty()) {
                    sb = new StringBuilder(stack.pop());
                }


            }


        }


    }
}
