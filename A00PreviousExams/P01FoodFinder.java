package A00PreviousExams;

import java.util.*;

public class P01FoodFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deque<String> vowelQueue = new ArrayDeque<>(); // Queue
        Deque<String> consonantsStack = new ArrayDeque<>(); // Stack

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(vowelQueue::offer);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(consonantsStack::push);


        List<String> listWithWords = List.of("pear", "flour", "pork", "olive");
        String[] addCharToWordArr = new String[listWithWords.size()];
        addCharToWordArr[0] = "----";
        addCharToWordArr[1] = "-----";
        addCharToWordArr[2] = "----";
        addCharToWordArr[3] = "-----";


        while (!consonantsStack.isEmpty()) {
            String vowel = vowelQueue.poll();
            String consonant = consonantsStack.pop();

            for (int i = 0; i < listWithWords.size(); i++) {
                if ((listWithWords.get(i)).contains(vowel)) {
                    int index = listWithWords.get(i).indexOf(vowel);
                    String dashWord = addCharToWordArr[i];
                    StringBuilder sb = new StringBuilder();
                    sb.append(dashWord);
                    sb.setCharAt(index, vowel.charAt(0));
                    String toAdd = sb.toString();
                    addCharToWordArr[i] = toAdd;

                }

                if ((listWithWords.get(i)).contains(consonant)) {
                    int index = listWithWords.get(i).indexOf(consonant);
                    String dashWord = addCharToWordArr[i];
                    StringBuilder sb = new StringBuilder();
                    sb.append(dashWord);
                    sb.setCharAt(index, consonant.charAt(0));
                    String toAdd = sb.toString();
                    addCharToWordArr[i] = toAdd;

                }

            }


            vowelQueue.offerLast(vowel);

        }

        List<String> listFinalPrint = new ArrayList<>();
        for (int i = 0; i < addCharToWordArr.length; i++) {
            if (!addCharToWordArr[i].contains("-")) {
                listFinalPrint.add(addCharToWordArr[i]);
            }
        }

        System.out.printf("Words found: %d%n", listFinalPrint.size());
        for (String s : listFinalPrint) {
            System.out.println(s);
        }

    }
}


//                   Друго решение на тази задача
//
//   Deque<String> vowels = new ArrayDeque<>(); // Queue
//        Deque<String> consonants = new ArrayDeque<>(); // Stack
//
//        Arrays.stream(scanner.nextLine().split("\\s+"))
//              .forEach(vowels::offer);
//
//        Arrays.stream(scanner.nextLine().split("\\s+"))
//              .forEach(consonants::push);
//
//        List<String> words = List.of("pear", "flour", "pork", "olive");
//        List<String> foundWords = new java.util.ArrayList<>(List.of("____", "_____", "____", "_____"));
//
//        while (!consonants.isEmpty()) {
//            String vowel = vowels.poll();
//            String consonant = consonants.pop();
//
//            for (int i = 0; i < words.size(); i++) {
//                String currentWord = words.get(i);
//                String emptyWord = foundWords.get(i);
//                if (currentWord.contains(vowel)) {
//                    int vowelIndex = currentWord.indexOf(vowel);
//                    String newWord = emptyWord.substring(0, vowelIndex)
//                                     + currentWord.charAt(vowelIndex) + emptyWord.substring(vowelIndex + 1);
//                    foundWords.set(i, newWord);
//                }
//                if (currentWord.contains(consonant)) {
//                    int consonantIndex = currentWord.indexOf(consonant);
//                    emptyWord = foundWords.get(i);
//                    String newWord = emptyWord.substring(0, consonantIndex)
//                                     + currentWord.charAt(consonantIndex) + emptyWord.substring(consonantIndex + 1);
//                    foundWords.set(i, newWord);
//                }
//            }
//            vowels.offer(vowel);
//        }
//
//        List<String> result = foundWords.stream()
//                                        .filter(word -> !word.contains("_"))
//                                        .collect(Collectors.toList());
//        System.out.printf("Words found: %d\n", result.size());
//        result.forEach(System.out::println);
//    }
//}