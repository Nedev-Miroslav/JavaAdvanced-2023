package DefiningClassesExercise.P04RawData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> map = new LinkedHashMap<>();


        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");


            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);

            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];

            Cargo cargo = new Cargo(cargoWeight, cargoType);

            double pressure1 = Double.parseDouble(input[5]);
            int age1 = Integer.parseInt(input[6]);
            double pressure2 = Double.parseDouble(input[7]);
            int age2 = Integer.parseInt(input[8]);
            double pressure3 = Double.parseDouble(input[9]);
            int age3 = Integer.parseInt(input[10]);
            double pressure4 = Double.parseDouble(input[11]);
            int age4 = Integer.parseInt(input[12]);

            Tire tire = new Tire(pressure1, age1, pressure2, age2, pressure3, age3, pressure4, age4);


            Car car = new Car(model, engine, cargo, tire);

            map.put(model, car);

        }


        String type = scanner.nextLine();


        if (type.equals("fragile")) {
            for (Map.Entry<String, Car> entry : map.entrySet()) {
                Car current = entry.getValue();
                if (current.isLow()) {
                    System.out.println(entry.getKey());
                }
            }


        } else if (type.equals("flamable")) {

            for (Map.Entry<String, Car> entry : map.entrySet()) {
                Car current = entry.getValue();
                if (current.isPower()) {
                    System.out.println(entry.getKey());
                }
            }


        }


    }
}
