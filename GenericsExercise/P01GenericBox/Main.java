package GenericsExercise.P01GenericBox; // При събмит да се премахне package!

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box<String>  box = new Box<>();


        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            box.addElement(input);
        }
        System.out.println(box);


    }
}
