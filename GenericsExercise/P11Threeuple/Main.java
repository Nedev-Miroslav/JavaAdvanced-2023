package GenericsExercise.P11Threeuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(" ");
        String name = input[0] + " " + input[1];
        String address = input[2];
        String town = input[3];

        Threeuple<String, String, String> firstTreeuple = new Threeuple<>(name, address, town);

        input = scanner.nextLine().split(" ");
        String firstName = input[0];
        Integer beer = Integer.parseInt(input[1]);
        String drinkOrNot = input[2];
        Boolean trueOrFalse = null;

        if (drinkOrNot.equals("drunk")) {
            trueOrFalse = true;
        } else {
            trueOrFalse = false;
        }
        Threeuple<String, Integer, Boolean> secondTreeuple = new Threeuple<>(firstName, beer, trueOrFalse);

        input = scanner.nextLine().split(" ");
        String names = input[0];
        Double balance = Double.parseDouble(input[1]);
        String bank = input[2];

        Threeuple<String, Double, String> thirdTreeuple = new Threeuple<>(names, balance, bank);


        System.out.println(firstTreeuple);
        System.out.println(secondTreeuple);
        System.out.println(thirdTreeuple);


    }
}
