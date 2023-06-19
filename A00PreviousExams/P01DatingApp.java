package A00PreviousExams;

import java.util.*;

public class P01DatingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> maleStack = new ArrayDeque<>();
        Deque<Integer> femaleQueue = new ArrayDeque<>();


        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .forEach(maleStack::push);

        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .forEach(femaleQueue::offer);

        int counter = 0;
        while (!maleStack.isEmpty() && !femaleQueue.isEmpty()) {

            int male = maleStack.peek();
            int female = femaleQueue.peek();

            if (male <= 0) {
                maleStack.pop();
                continue;

            }


            if (female <= 0) {
                femaleQueue.poll();
                continue;
            }


            if (male % 25 == 0) {
                maleStack.pop();
                if (maleStack.size() > 0) {
                    maleStack.pop();

                }
                continue;

            }


            if (female % 25 == 0) {
                femaleQueue.poll();
                if (femaleQueue.size() > 0) {
                    femaleQueue.poll();

                }
                continue;

            }

            if (female == male) {
                maleStack.pop();
                femaleQueue.poll();
                counter++;
            } else {
                int m = maleStack.pop();
                maleStack.push(m - 2);
                femaleQueue.poll();


            }

        }
        System.out.printf("Matches: %d%n", counter);


        if (maleStack.isEmpty()) {
            System.out.println("Males left: none");
        } else {
            List<String> toPrint = new ArrayList<>();
            System.out.print("Males left: ");
            while (!maleStack.isEmpty()) {
                toPrint.add(String.valueOf(maleStack.pop()));

            }
            System.out.println(String.join(", ", toPrint));
        }


        if (femaleQueue.isEmpty()) {
            System.out.println("Females left: none");
        } else {
            List<String> toPrint = new ArrayList<>();
            System.out.print("Females left: ");
            while (!femaleQueue.isEmpty()) {
                toPrint.add(String.valueOf(femaleQueue.poll()));

            }
            System.out.println(String.join(", ", toPrint));
        }


    }
}
