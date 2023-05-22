package SetsAndMapsAdvancedExercise;

import java.util.*;

public class P07HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();


        Map<String, Set<String>> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {

            String playerName = input.split(":\\s+")[0];
            String cards = input.split(":\\s+")[1];
            String [] cardsArr = cards.split(", ");

            Set<String> cardsSet = new HashSet<>(); //картите на играча
            cardsSet.addAll(Arrays.asList(cardsArr));


            if (!players.containsKey(playerName)) {
                players.put(playerName, cardsSet);
            }

            else {

                Set<String> currentCards = players.get(playerName);

                currentCards.addAll(cardsSet);
                players.put(playerName, currentCards);
            }
            input = scanner.nextLine();
        }


        players.entrySet().forEach(entry -> {
            String name = entry.getKey();
            Set<String> cards = entry.getValue();
            int points = getCardsPoints(cards);
            System.out.printf("%s: %d%n", name, points);
        });
    }

    private static int getCardsPoints(Set<String> cards) {

        Map<Character, Integer> symbolsValues = getSymbolsValues();
        int sumPoints = 0;

        for (String card : cards) {

            int points = 0;
            if (card.startsWith("10")) {

                char type = card.charAt(2);
                points = 10 * symbolsValues.get(type);
            } else {

                char power = card.charAt(0);
                char type = card.charAt(1);
                points = symbolsValues.get(power) * symbolsValues.get(type);
            }

            sumPoints += points;
        }

        return sumPoints;
    }

    private static Map<Character, Integer> getSymbolsValues() {
        Map<Character, Integer> characterValues = new HashMap<>();
        characterValues.put('2', 2);
        characterValues.put('3', 3);
        characterValues.put('4', 4);
        characterValues.put('5', 5);
        characterValues.put('6', 6);
        characterValues.put('7', 7);
        characterValues.put('8', 8);
        characterValues.put('9', 9);
        characterValues.put('J', 11);
        characterValues.put('Q', 12);
        characterValues.put('K', 13);
        characterValues.put('A', 14);
        characterValues.put('S', 4);
        characterValues.put('H', 3);
        characterValues.put('D', 2);
        characterValues.put('C', 1);
        return characterValues;
    }
}


//        Моето решение:
//        String input = scanner.nextLine();
//        LinkedHashMap<String, Set<String>> map = new LinkedHashMap<>();
//
//
//        while (!input.equals("JOKER")) {
//
//            String name = input.split(": ")[0];
//            String[] cardS = input.split(": ")[1].split(", ");
//
//
//            if (!map.containsKey(name)) {
//                map.put(name, new LinkedHashSet<>());
//
//            }
//            Set<String> set = map.get(name);
//
//            for (int i = 0; i < cardS.length; i++) {
//                set.add(cardS[i]);
//            }
//            map.put(name, set);
//
//
//            input = scanner.nextLine();
//        }
//
//        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
//            Set<String> resultSet = entry.getValue();
//            int finalScore = 0;
//
//            for (String currentCard : resultSet) {
//
//                String power = currentCard.charAt(0) + "";
//                String type = currentCard.charAt(1) + "";
//                if (currentCard.length() == 3) {
//                    power = "10";
//                    type = currentCard.charAt(2) + "";
//                }
//                int intType = 0;
//                int intPower = 0;
//                int currentScore;
//
//                switch (power) {
//                    case "2":
//                        intPower = 2;
//                        break;
//                    case "3":
//                        intPower = 3;
//                        break;
//                    case "4":
//                        intPower = 4;
//                        break;
//                    case "5":
//                        intPower = 5;
//                        break;
//                    case "6":
//                        intPower = 6;
//                        break;
//                    case "7":
//                        intPower = 7;
//                        break;
//                    case "8":
//                        intPower = 8;
//                        break;
//                    case "9":
//                        intPower = 9;
//                        break;
//                    case "10":
//                        intPower = 10;
//                        break;
//                    case "J":
//                        intPower = 11;
//                        break;
//                    case "Q":
//                        intPower = 12;
//                        break;
//                    case "K":
//                        intPower = 13;
//                        break;
//                    case "A":
//                        intPower = 14;
//                        break;
//
//
//                }
//                switch (type) {
//                    case "S":
//                        intType = 4;
//                        break;
//                    case "H":
//                        intType = 3;
//                        break;
//                    case "D":
//                        intType = 2;
//                        break;
//                    case "C":
//                        intType = 1;
//                        break;
//
//                }
//                currentScore = intPower * intType;
//
//                finalScore += currentScore;
//
//            }
//            System.out.printf("%s: %d%n", entry.getKey(), finalScore);
//
//
//        }
//
//
//    }
//
//
//}
