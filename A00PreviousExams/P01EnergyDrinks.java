package A00PreviousExams;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] mg = scanner.nextLine().split(",\\s+");
        String[] drink = scanner.nextLine().split(",\\s+");

        ArrayDeque<Integer> stackMg = new ArrayDeque<>();
        ArrayDeque<Integer> queueDrink = new ArrayDeque<>();

        Arrays.stream(mg)
                .mapToInt(Integer::parseInt)
                .forEach(stackMg::push);

        Arrays.stream(drink)
                .mapToInt(Integer::parseInt)
                .forEach(queueDrink::offer);


        int takenCaffeine = 0;

        while (!stackMg.isEmpty() && !queueDrink.isEmpty()) {

            int currentMg = stackMg.peek();
            int currentDrink = queueDrink.peek();

            int multiplying = currentMg * currentDrink;

            if (takenCaffeine + multiplying <= 300) {

                takenCaffeine += multiplying;

                stackMg.pop();
                queueDrink.poll();


            } else {
                stackMg.pop();
                int toAdd = queueDrink.poll();
                queueDrink.offerLast(toAdd);

                if (takenCaffeine - 30 > 0) {
                    takenCaffeine -= 30;
                }

            }



        }

        if (queueDrink.size() > 0) {
            System.out.print("Drinks left: ");
            for (int i = 0; i < queueDrink.size(); i++) {
                if (i < queueDrink.size() - 1) {
                    System.out.print(queueDrink.poll() + ", ");
                    i--;
                } else {
                    System.out.println(queueDrink.poll());
                    i--;
                }
            }
        } else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");

        }
        System.out.printf("Stamat is going to sleep with %d mg caffeine.%n", takenCaffeine);

    }
}

