package SetsAndMapsAdvanced;

import java.util.*;


public class P07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, List<String>>> map = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            String continent = input.split("\\s+")[0];
            String country = input.split("\\s+")[1];
            String city = input.split("\\s+")[2];

            map.putIfAbsent(continent, new LinkedHashMap<>());
            LinkedHashMap<String, List<String>> map1 = map.get(continent);
            map1.putIfAbsent(country, new ArrayList<>());
            List<String> cityList = map1.get(country);
            cityList.add(city);

            // Моето решение
//            map.putIfAbsent(continent, new LinkedHashMap<>());
//            map.get(continent).putIfAbsent(country, new ArrayList<>());
//            map.get(continent).get(country).add(city);


        }


        map.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + ":");
            entry.getValue().entrySet().stream().forEach(inEntry -> {
                String cities = String.join(", ", inEntry.getValue());
                System.out.printf("  %s -> %s%n", inEntry.getKey(), cities);
            });

        });


//        for (Map.Entry<String, LinkedHashMap<String, List<String>>> entry : map.entrySet()) {
//            System.out.printf("%s:%n", entry.getKey());
//
//            for (Map.Entry<String, List<String>> stringListEntry : entry.getValue().entrySet()) {
//                System.out.printf("  %s -> ", stringListEntry.getKey());
//                System.out.println(String.join(", ", stringListEntry.getValue()));
//
//
//            }
//
//
//        }


    }
}
