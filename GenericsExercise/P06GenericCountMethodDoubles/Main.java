package GenericsExercise.P06GenericCountMethodDoubles; // При събмит да се премахне package!

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<Double> box = new Box<>();


        for (int i = 1; i <= n; i++) {
            Double input = Double.parseDouble(scanner.nextLine());
            box.addElement(input);
        }

        Double elementToCompare = Double.parseDouble(scanner.nextLine());


        System.out.println(box.compareElement(elementToCompare));


    }
}
