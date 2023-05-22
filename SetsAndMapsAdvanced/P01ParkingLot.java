package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> plateNum = new LinkedHashSet<>();

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] input = command.split(", ");
            String direction = input[0];
            String number = input[1];


            if (direction.equals("IN")) {
                plateNum.add(number);
            } else if (direction.equals("OUT")) {
                plateNum.remove(number);
            }


            command = scanner.nextLine();
        }
        if (plateNum.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String leftCars : plateNum) {
                System.out.println(leftCars);
            }
        }

    }
}
