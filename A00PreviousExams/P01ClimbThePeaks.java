package A00PreviousExams;

import java.util.*;

public class P01ClimbThePeaks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> portionsStack = new ArrayDeque<>();
        Deque<Integer> staminaQueue = new ArrayDeque<>();


        Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt)
                .forEach(portionsStack::push);

        Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt)
                .forEach(staminaQueue::offer);


        boolean isVihren = false;
        boolean isKutelo = false;
        boolean isBanskiSuhodol = false;
        boolean isPolezhan = false;
        boolean isKamenitza = false;

        boolean isAllPeek = false;

        List<String> conqueredList = new ArrayList<>();


        for (int i = 1; i <= 7; i++) {

            int portion = portionsStack.pop();
            int stamina = staminaQueue.poll();
            int sum = portion + stamina;


            if (sum >= 80 && !isVihren) {
                isVihren = true;
                conqueredList.add("Vihren");


            } else if (sum >= 90 && !isKutelo && isVihren) {
                isKutelo = true;
                conqueredList.add("Kutelo");


            } else if (sum >= 100 && !isBanskiSuhodol && isKutelo) {
                isBanskiSuhodol = true;
                conqueredList.add("Banski Suhodol");

            } else if (sum >= 60 && !isPolezhan && isBanskiSuhodol) {
                isPolezhan = true;
                conqueredList.add("Polezhan");


            } else if (sum >= 70 && !isKamenitza && isPolezhan) {
                isKamenitza = true;
                conqueredList.add("Kamenitza");


            }

            if (isVihren && isKutelo && isBanskiSuhodol && isPolezhan && isKamenitza) {
                isAllPeek = true;
                break;
            }


        }

        if (isAllPeek) {
            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");

        } else {
            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
        }
        if (conqueredList.size() > 0) {
            System.out.println("Conquered peaks:");
        }
        for (String s : conqueredList) {
            System.out.println(s);
        }


    }
}
// Друго решение на тази задача
//
//
//        Deque<Integer> portionsStack = new ArrayDeque<>();
//        Deque<Integer> staminaQueue = new ArrayDeque<>();
//
//
//        Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt)
//                .forEach(portionsStack::push);
//
//        Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt)
//                .forEach(staminaQueue::offer);
//
//
//        ArrayDeque<String> peaks = new ArrayDeque<>(Arrays.asList("Vihren", "Kutelo", "Banski Suhodol", "Polezhan", "Kamenitza"));
//        HashMap<String, Integer> peakAndLevel = new LinkedHashMap<>(Map.of("Vihren", 80,
//                "Kutelo", 90,
//                "Banski Suhodol", 100,
//                "Polezhan", 60,
//                "Kamenitza", 70));
//
//        List<String> printList = new ArrayList<>();
//
//        for (int i = 1; i <= 7; i++) {
//            int portion = portionsStack.pop();
//            int stamina = staminaQueue.poll();
//            int sum = portion + stamina;
//
//            String currentPeek = peaks.getFirst();
//
//            if (peakAndLevel.get(currentPeek) <= sum) {
//                peaks.remove(currentPeek);
//                printList.add(currentPeek);
//
//            }
//
//            if (peaks.isEmpty()) {
//                break;
//            }
//
//
//        }
//
//        if (peaks.isEmpty()) {
//            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
//
//        } else {
//            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
//        }
//        if (printList.size() > 0) {
//            System.out.println("Conquered peaks:");
//            for (String s : printList) {
//                System.out.println(s);
//            }
//        }
//    }
//}