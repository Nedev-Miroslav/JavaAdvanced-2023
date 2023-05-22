package SetsAndMapsAdvancedExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Character, Integer> map = new TreeMap<>();

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            map.putIfAbsent(currentChar, 0);
            map.put(currentChar, map.get(currentChar) + 1);


        }
//          Мой начин за принтиране
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.printf("%s: %d time/s%n", entry.getKey(), entry.getValue());
//        }

//          Алтернативен рариан за принтиране

        map.forEach((k,v) -> System.out.printf("%c: %d time/s%n", k, v));;

    }
}
