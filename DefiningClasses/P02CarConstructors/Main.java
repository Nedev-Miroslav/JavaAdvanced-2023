package DefiningClasses.P02CarConstructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            if (input.length == 1) {
                String brand = input[0];
                Car car = new Car(brand);
                System.out.println(car);
            } else {
                String brand = input[0];
                String model = input[1];
                int horsePower = Integer.parseInt(input[2]);
                Car car = new Car(brand, model, horsePower);
                System.out.println(car);
            }


        }

    }

}
