package A00PreviousExams;

import java.util.*;
import java.util.stream.Collectors;

public class P01ApocalypsePreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textilesStack = scanner.nextLine().split("\\s+");
        String[] medicamentStack = scanner.nextLine().split("\\s+");

        Map<String, Integer> map = new HashMap<>();


        Deque<Integer> stackText = new ArrayDeque<>();
        Deque<Integer> stackMed = new ArrayDeque<>();

        for (int i = textilesStack.length - 1; i >= 0; i--) {
            int current = Integer.parseInt(textilesStack[i]);
            stackText.push(current);
        }


        for (int i = 0; i < medicamentStack.length; i++) {
            int current = Integer.parseInt(medicamentStack[i]);
            stackMed.push(current);
        }


        while (!stackText.isEmpty() && !stackMed.isEmpty()) {
            int text = stackText.pop();
            int med = stackMed.pop();


            int sum = text + med;

            if (sum == 100) {
                String nameMed = "MedKit";
                map.putIfAbsent(nameMed, 0);
                map.put(nameMed, map.get(nameMed) + 1);

            } else if (sum == 40) {
                String nameMed = "Bandage";
                map.putIfAbsent(nameMed, 0);
                map.put(nameMed, map.get(nameMed) + 1);

            } else if (sum == 30) {
                String nameMed = "Patch";
                map.putIfAbsent(nameMed, 0);
                map.put(nameMed, map.get(nameMed) + 1);
            } else if (sum > 100) {
                int diff = sum - 100;
                String nameMed = "MedKit";
                map.putIfAbsent(nameMed, 0);
                map.put(nameMed, map.get(nameMed) + 1);
                int toAdd = stackMed.pop() + diff;

                stackMed.push(toAdd);

            } else {
                stackMed.push(med + 10);
            }
            if (stackText.isEmpty()) {
                break;
            }
            if (stackMed.isEmpty()) {
                break;
            }

        }
        if (stackText.isEmpty() && stackMed.isEmpty()) {
            System.out.println("Textiles and medicaments are both empty.");
        } else if (stackText.isEmpty()) {
            System.out.println("Textiles are empty.");
        } else {
            System.out.println("Medicaments are empty.");
        }
        Map<String, Integer> resultMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


        resultMap.forEach((k, v) -> System.out.printf("%s - %d%n", k, v));


        if (stackMed.size() > 0) {
            int count = stackMed.size();
            System.out.print("Medicaments left: ");
            for (int n : stackMed) {


                if (count > 1) {
                    System.out.printf("%d, ", n);
                } else {
                    System.out.printf("%d%n", n);
                }
                count--;
            }
        }

        if (stackText.size() > 0) {
            int count = stackText.size();
            System.out.print("Textiles left: ");
            for (int n : stackText) {

                if (count > 1) {
                    System.out.printf("%d, ", n);
                } else {
                    System.out.printf("%d%n", n);
                }
                count--;
            }

        }


    }
}

