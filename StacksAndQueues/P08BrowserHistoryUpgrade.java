package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<String> backUrls = new ArrayDeque<>();
        ArrayDeque<String> forwardUrls = new ArrayDeque<>();

        String input = scanner.nextLine();


        while (!input.equals("Home")) {
            if (input.equals("")) {
                continue;
            }

            if (input.equals("back")) {
                if (backUrls.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {

                    forwardUrls.push(backUrls.pop());
                    System.out.println(backUrls.peek());

                }


            } else if (input.equals("forward")) {
                if (forwardUrls.size() < 1) {
                    System.out.println("no next URLs");
                } else {

                    String current = forwardUrls.pop();
                    backUrls.push(current);
                    System.out.println(current);

                }


            } else {
                backUrls.push(input);
                System.out.println(input);
                forwardUrls.clear();

            }


            input = scanner.nextLine();
        }


    }
}