package SetsAndMapsAdvancedExercise;

import java.util.Scanner;
import java.util.TreeSet;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeSet<String> set = new TreeSet<>();

        for (int i = 1; i <= n; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            for (int j = 0; j < input.length; j++) {
                String currentElement = input[j];
                set.add(currentElement);
            }


        }

        for (String s : set) {
            System.out.printf("%s ", s);
        }


    }
}
