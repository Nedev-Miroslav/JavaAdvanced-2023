package A00PreviousExams;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P01KAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Deque<Integer> licensePlatesQueue = new ArrayDeque<>();
        Deque<Integer> carStack = new ArrayDeque<>();


        Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt)
                .forEach(licensePlatesQueue::offer);

        Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt)
                .forEach(carStack::push);

        int days = 0;
        int registeredCars = 0;

        while (!licensePlatesQueue.isEmpty() && !carStack.isEmpty()) {
            days++;
            int license = licensePlatesQueue.peek();
            int car = carStack.peek();


            if (license / 2 == car) {
                licensePlatesQueue.poll();
                carStack.pop();
                registeredCars += car;
            } else if (license - car * 2 > 0) {
                int diff = license - car * 2;
                licensePlatesQueue.poll();
                carStack.pop();
                licensePlatesQueue.offerLast(diff);
                registeredCars += car;
            } else if (license - car * 2 < 0) {
                int diff = car - license / 2;
                licensePlatesQueue.poll();
                carStack.pop();
                carStack.addLast(diff);
                registeredCars += car - diff;
            }


        }

        System.out.printf("%d cars were registered for %d days!%n", registeredCars, days);

        if (licensePlatesQueue.isEmpty() && carStack.isEmpty()) {
            System.out.println("Good job! There is no queue in front of the KAT!");
        }

        if (!licensePlatesQueue.isEmpty()) {
            int sum = 0;
            while (!licensePlatesQueue.isEmpty()) {
                sum += licensePlatesQueue.poll();
            }
            System.out.printf("%d license plates remain!%n", sum);
        } else if (!carStack.isEmpty()) {
            int sum = 0;
            while (!carStack.isEmpty()) {
                sum += carStack.pop();
            }
            System.out.printf("%d cars remain without license plates!%n", sum);
        }
    }
}
