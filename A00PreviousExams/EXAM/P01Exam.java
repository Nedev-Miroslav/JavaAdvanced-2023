package A00PreviousExams.EXAM;

import java.util.*;
import java.util.stream.Collectors;

public class P01Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Deque<Integer> toolsQueue = new ArrayDeque<>();
        Deque<Integer> substancesStack = new ArrayDeque<>();


        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .forEach(toolsQueue::offer);

        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .forEach(substancesStack::push);


        List<Integer> listChallenges = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());


        boolean isWin = false;

        while (!toolsQueue.isEmpty() && !substancesStack.isEmpty()) {
            int tools = toolsQueue.poll();
            int substances = substancesStack.pop();

            int multiplication = tools * substances;

            boolean isContent = false;
            for (int i = 0; i < listChallenges.size(); i++) {


                if (listChallenges.get(i) == multiplication) {
                    listChallenges.remove(listChallenges.get(i));
                    isContent = true;
                    break;
                }
            }
            if (!isContent) {
                toolsQueue.addLast(tools + 1);
                if (substances - 1 > 0) {
                    substancesStack.push(substances - 1);

                }
            }


            if (listChallenges.isEmpty()) {
                isWin = true;
                break;
            }


        }


        if (isWin) {
            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
        } else {
            System.out.println("Harry is lost in the temple. Oblivion awaits him.");
        }

        if (toolsQueue.size() > 0) {
            List<String> toPrint = new ArrayList<>();
            System.out.print("Tools: ");
            while (!toolsQueue.isEmpty()) {
                toPrint.add(String.valueOf(toolsQueue.poll()));

            }
            System.out.println(String.join(", ", toPrint));


        }


        if (substancesStack.size() > 0) {
            List<String> toPrint = new ArrayList<>();
            System.out.print("Substances: ");
            while (!substancesStack.isEmpty()) {
                toPrint.add(String.valueOf(substancesStack.pop()));

            }
            System.out.println(String.join(", ", toPrint));


        }
        if (listChallenges.size() > 0) {
            System.out.print("Challenges: ");
            System.out.println(listChallenges.toString().replaceAll("[\\[\\]]", ""));
        }

    }
}
