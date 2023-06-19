package A00PreviousExams;

import java.util.*;

public class P01RubberDuckDebuggers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] time = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] task = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Map<String, Integer> map = new LinkedHashMap<>();

        Deque<Integer> queueTime = new ArrayDeque<>();
        Deque<Integer> stackTask = new ArrayDeque<>();

        for (int i = 0; i < time.length; i++) {
            int current = time[i];
            queueTime.offer(current);
        }

        for (int i = 0; i < task.length; i++) {
            int current = task[i];
            stackTask.push(current);
        }

        map.put("Darth Vader Ducky", 0);
        map.put("Thor Ducky", 0);
        map.put("Big Blue Rubber Ducky", 0);
        map.put("Small Yellow Rubber Ducky", 0);

        while (!queueTime.isEmpty() && !stackTask.isEmpty()) {
            int times = queueTime.peek();
            int tasks = stackTask.peek();

            int currentMultiply = times * tasks;

            if (currentMultiply >= 0 && currentMultiply <= 60) {
                queueTime.poll();
                stackTask.pop();
                map.put("Darth Vader Ducky", map.get("Darth Vader Ducky") + 1);

            } else if (currentMultiply >= 61 && currentMultiply <= 120) {
                queueTime.poll();
                stackTask.pop();
                map.put("Thor Ducky", map.get("Thor Ducky") + 1);


            } else if (currentMultiply >= 121 && currentMultiply <= 180) {
                queueTime.poll();
                stackTask.pop();
                map.put("Big Blue Rubber Ducky", map.get("Big Blue Rubber Ducky") + 1);


            } else if (currentMultiply >= 181 && currentMultiply <= 240) {
                queueTime.poll();
                stackTask.pop();
                map.put("Small Yellow Rubber Ducky", map.get("Small Yellow Rubber Ducky") + 1);


            } else {
                int n = queueTime.poll();
                int m = stackTask.pop();
                queueTime.offer(n);
                int toAdd = m - 2;
                stackTask.push(toAdd);


            }


        }

        System.out.println("Congratulations, all tasks have been completed! Rubber ducks rewarded: ");
        map.forEach((k, v) -> System.out.printf("%s: %d%n", k, v));

    }
}
