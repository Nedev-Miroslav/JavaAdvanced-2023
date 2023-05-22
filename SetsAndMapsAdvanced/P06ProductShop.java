package SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<String, LinkedHashMap<String, Double>> map = new TreeMap<>();


        while (!input.equals("Revision")) {

            String shop = input.split(", ")[0];
            String product = input.split(", ")[1];
            double price = Double.parseDouble(input.split(", ")[2]);

            map.putIfAbsent(shop, new LinkedHashMap<>());
            map.get(shop).put(product, price);


            input = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Double>> entry : map.entrySet()) {

            System.out.printf("%s->%n", entry.getKey());

            for (Map.Entry<String, Double> stringDoubleEntry : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", stringDoubleEntry.getKey(), stringDoubleEntry.getValue());
            }


        }


    }
}
