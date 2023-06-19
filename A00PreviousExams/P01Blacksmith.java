package A00PreviousExams;

import java.util.*;

public class P01Blacksmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> steelQueue = new ArrayDeque<>();
        Deque<Integer> carbonStack = new ArrayDeque<>();


        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .forEach(steelQueue::offer);

        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .forEach(carbonStack::push);


        TreeMap<String, Integer> map = new TreeMap<>();


        int count = 0;

        while (!steelQueue.isEmpty() && !carbonStack.isEmpty()) {
            int steel = steelQueue.poll();
            int carbon = carbonStack.pop();

            int sum = steel + carbon;

            if (sum == 70) {
                map.putIfAbsent("Gladius", 0);
                map.put("Gladius", map.get("Gladius") + 1);
                count++;

            } else if (sum == 80) {
                map.putIfAbsent("Shamshir", 0);
                map.put("Shamshir", map.get("Shamshir") + 1);
                count++;


            } else if (sum == 90) {
                map.putIfAbsent("Katana", 0);
                map.put("Katana", map.get("Katana") + 1);
                count++;


            } else if (sum == 110) {
                map.putIfAbsent("Sabre", 0);
                map.put("Sabre", map.get("Sabre") + 1);
                count++;


            } else {
                carbonStack.push(carbon + 5);


            }


        }

        if (count > 0) {
            System.out.printf("You have forged %d swords.%n", count);
        } else {
            System.out.println("You did not have enough resources to forge a sword.");
        }

        if (steelQueue.isEmpty()) {
            System.out.println("Steel left: none");
        } else {
            List<String> toPrint = new ArrayList<>();
            System.out.print("Steel left: ");
            while (!steelQueue.isEmpty()) {
                toPrint.add(String.valueOf(steelQueue.poll()));

            }
            System.out.println(String.join(", ", toPrint));
        }


        if (carbonStack.isEmpty()) {
            System.out.println("Carbon left: none");
        } else {
            List<String> toPrint = new ArrayList<>();
            System.out.print("Carbon left: ");
            while (!carbonStack.isEmpty()) {
                toPrint.add(String.valueOf(carbonStack.pop()));

            }
            System.out.println(String.join(", ", toPrint));
        }


        if (map.size() > 0) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.printf("%s: %s%n", entry.getKey(), entry.getValue());
            }


        }


    }
}
