package SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        LinkedHashMap<Double, Integer> map = new LinkedHashMap<>();


        for (int i = 0; i < arr.length; i++) {
            double current = arr[i];

            map.putIfAbsent(current, 0);
            map.put(current, map.get(current) + 1);

        }


        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
