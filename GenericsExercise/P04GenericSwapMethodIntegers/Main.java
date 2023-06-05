package GenericsExercise.P04GenericSwapMethodIntegers; // При събмит да се премахне package!



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<Integer> box = new Box<>();


        for (int i = 1; i <= n; i++) {
            Integer input = Integer.parseInt(scanner.nextLine());
            box.addElement(input);
        }

        String[] indexes = scanner.nextLine().split("\\s+");
        int first = Integer.parseInt(indexes[0]);
        int second = Integer.parseInt(indexes[1]);

        box.swapElement(first, second);


        System.out.println(box);


    }
}
