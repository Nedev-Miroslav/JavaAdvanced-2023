package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // решение с два отделни сета
        Set<String> vipSet = new TreeSet<>();
        Set<String> regularSet = new TreeSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")) {

            if (Character.isDigit(input.charAt(0))) {
                vipSet.add(input);
            } else {
                regularSet.add(input);
            }

            input = scanner.nextLine();
        }
        String secondInput = scanner.nextLine();
        while (!secondInput.equals("END")) {
            if (Character.isDigit(secondInput.charAt(0))) {
                vipSet.remove(secondInput);
            } else {
                regularSet.remove(secondInput);
            }

            secondInput = scanner.nextLine();
        }

        System.out.println(vipSet.size() + regularSet.size());
        for (String s : vipSet) {
            System.out.println(s);
        }
        for (String s : regularSet) {
            System.out.println(s);
        }


        // решение само с един сет
//        Set<String> guestsSet = new TreeSet<>();
//
//        String input = scanner.nextLine();
//
//
//        while (!input.equals("PARTY")) {
//
//            guestsSet.add(input);
//
//            input = scanner.nextLine();
//        }
//
//        String secondInput = scanner.nextLine();
//        while (!secondInput.equals("END")) {
//
//            guestsSet.remove(secondInput);
//
//
//            secondInput = scanner.nextLine();
//        }
//        System.out.println(guestsSet.size());
//        for (String guest : guestsSet) {
//            System.out.println(guest);
//        }
    }
}
