package SetsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class P01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            set.add(input);


        }

        set.forEach(System.out::println);


    }
}
