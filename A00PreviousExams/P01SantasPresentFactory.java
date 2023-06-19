package A00PreviousExams;

import java.util.*;

public class P01SantasPresentFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Deque<Integer> materialStack = new ArrayDeque<>();
        Deque<Integer> magicQueue = new ArrayDeque<>();


        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .forEach(materialStack::push);

        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .forEach(magicQueue::offer);

        TreeMap<String, Integer> map = new TreeMap<>();

        boolean isDone = false;

        while (!magicQueue.isEmpty() && !materialStack.isEmpty()) {
            int material = materialStack.peek();

            if (material == 0) {
                if (materialStack.size() > 1) {
                    materialStack.pop();
                    material = materialStack.peek();
                } else {
                    materialStack.pop();
                }
            }

            int magic = magicQueue.peek();
            if (magic == 0) {
                if (magicQueue.size() > 1) {
                    magicQueue.poll();
                    magic = magicQueue.peek();
                } else {
                    magicQueue.poll();
                }
            }

            int multiplication = material * magic;


            if (multiplication == 150) {
                materialStack.pop();
                magicQueue.poll();
                map.putIfAbsent("Doll", 0);
                map.put("Doll", map.get("Doll") + 1);


            } else if (multiplication == 250) {
                materialStack.pop();
                magicQueue.poll();
                map.putIfAbsent("Wooden train", 0);
                map.put("Wooden train", map.get("Wooden train") + 1);


            } else if (multiplication == 300) {
                materialStack.pop();
                magicQueue.poll();
                map.putIfAbsent("Teddy bear", 0);
                map.put("Teddy bear", map.get("Teddy bear") + 1);


            } else if (multiplication == 400) {
                materialStack.pop();
                magicQueue.poll();
                map.putIfAbsent("Bicycle", 0);
                map.put("Bicycle", map.get("Bicycle") + 1);


            } else if (multiplication < 0) {

                int sum = materialStack.pop() + magicQueue.poll();
                materialStack.push(sum);


            } else if (multiplication > 0) {
                materialStack.push((materialStack.pop() + 15));

                magicQueue.poll();

            }

            if (map.containsKey("doll") && map.containsKey("Wooden train")) {
                isDone = true;

            }

            if (map.containsKey("Teddy bear") && map.containsKey("Bicycle")) {
                isDone = true;

            }


        }


        if (isDone) {
            System.out.println("The presents are crafted! Merry Christmas!");
        } else {
            System.out.println("No presents this Christmas!");
        }

        if (materialStack.size() > 0) {
            List<String> toPrint = new ArrayList<>();
            System.out.print("Materials left: ");
            while (!materialStack.isEmpty()) {
                toPrint.add(String.valueOf(materialStack.pop()));

            }
            System.out.println(String.join(", ", toPrint));
        }

        if (magicQueue.size() > 0) {
            List<String> toPrint = new ArrayList<>();
            System.out.print("Magic left: ");
            while (!magicQueue.isEmpty()) {
                toPrint.add(String.valueOf(magicQueue.poll()));

            }
            System.out.println(String.join(", ", toPrint));
        }


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }


    }


}
