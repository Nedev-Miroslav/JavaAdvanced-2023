package A00PreviousExams;

import java.util.*;

public class P01ItsChocolateTime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Double> milkQueue = new ArrayDeque<>();
        Deque<Double> cacaoStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble)
                .forEach(milkQueue::offer);

        Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble)
                .forEach(cacaoStack::push);

        TreeMap<String, Integer> map = new TreeMap<>();

        boolean one = false;
        boolean two = false;
        boolean tree = false;

        while (!milkQueue.isEmpty() && !cacaoStack.isEmpty()) {
            Double milk = milkQueue.poll();
            Double cacao = cacaoStack.pop();

            if (cacao == 0) {
                milkQueue.offerLast(milk + 10);
                continue;
            }
            double sum = milk + cacao;
            double percent = cacao / sum * 100.0;

            if (percent == 30) {
                map.putIfAbsent("Milk Chocolate", 0);
                map.put("Milk Chocolate", map.get("Milk Chocolate") + 1);
                one = true;
            } else if (percent == 50) {
                map.putIfAbsent("Dark Chocolate", 0);
                map.put("Dark Chocolate", map.get("Dark Chocolate") + 1);
                two = true;
            } else if (percent == 100) {
                map.putIfAbsent("Baking Chocolate", 0);
                map.put("Baking Chocolate", map.get("Baking Chocolate") + 1);
                tree = true;
            } else {
                milkQueue.offerLast(milk + 10);
            }


        }

        if (one && two && tree) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("# %s --> %d%n", entry.getKey(), entry.getValue());
        }


    }
}