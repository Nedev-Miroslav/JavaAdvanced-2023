package SetsAndMapsAdvancedExercise;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P011LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> legendaryMap = new HashMap<>();
        HashMap<String, Integer> junkMap = new HashMap<>();

        legendaryMap.put("shards", 0);
        legendaryMap.put("fragments", 0);
        legendaryMap.put("motes", 0);

        boolean isCollected = false;
        while (!isCollected) {
            String[] tokens = scanner.nextLine().toLowerCase().split("\\s+");
            for (int i = 0; i < tokens.length && !isCollected; i += 2) {
                String mat = tokens[i + 1];
                int amount = Integer.parseInt(tokens[i]);

                if ("shards".equals(mat) || "fragments".equals(mat) || "motes".equals(mat)) {
                    amount += legendaryMap.get(mat);
                    if (amount >= 250) {
                        amount -= 250;
                        isCollected = true;
                        switch (mat) {
                            case "shards":
                                System.out.println("Shadowmourne obtained!");
                                break;
                            case "fragments":
                                System.out.println("Valanyr obtained!");
                                break;
                            case "motes":
                                System.out.println("Dragonwrath obtained!");
                                break;
                        }
                    }
                    legendaryMap.put(mat, amount);
                } else {
                    if (junkMap.containsKey(mat)) {
                        junkMap.put(mat, junkMap.get(mat) + amount);
                    } else {
                        junkMap.put(mat, amount);
                    }
                }
            }
        }

        legendaryMap.entrySet().stream().sorted((e1, e2) -> {
                    if (e2.getValue().compareTo(e1.getValue()) == 0) {
                        return e1.getKey().compareTo(e2.getKey());
                    }
                    return e2.getValue().compareTo(e1.getValue());
                })
                .forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));

        junkMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));
    }
}