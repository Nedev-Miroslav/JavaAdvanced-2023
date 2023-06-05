package DefiningClassesExercise.P03SpeedRacing;

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
            double fuelAmount = Double.parseDouble(input[1]);
            double consumptionFor1Km = Double.parseDouble(input[2]);
            Car car = new Car(model,fuelAmount, consumptionFor1Km);

            map.put(model, car);
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String currentModel = command.split("\\s+")[1];
            int kmToDrive = Integer.parseInt(command.split("\\s+")[2]);


            Car currentDrivenCar = map.get(currentModel);

            if (!currentDrivenCar.canDrive(kmToDrive)) {
                System.out.println("Insufficient fuel for the drive");
            }

            command = scanner.nextLine();
        }
        map.forEach((k,v) -> System.out.println(v));
    }
}
