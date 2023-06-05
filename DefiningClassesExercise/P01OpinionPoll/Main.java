package DefiningClassesExercise.P01OpinionPoll;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeSet<Person> personTreeSet = new TreeSet<>(Comparator.comparing(Person::getName));

        for (int i = 1; i <= n; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            String name = input[0];
            int age = Integer.parseInt(input[1]);

            if (age > 30) {

                Person person = new Person(name, age);
                personTreeSet.add(person);
            }

        }

        personTreeSet.forEach(System.out::println);

    }
}
