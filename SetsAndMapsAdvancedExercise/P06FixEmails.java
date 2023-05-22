package SetsAndMapsAdvancedExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String email = scanner.nextLine();

            map.put(input, email);


            input = scanner.nextLine();
        }
        map.entrySet().removeIf(entry -> entry.getValue().endsWith("us")
                || entry.getValue().endsWith("uk") || entry.getValue().endsWith("com"));

        map.forEach((k, v) -> System.out.printf("%s -> %s%n", k, v));
    }
}
