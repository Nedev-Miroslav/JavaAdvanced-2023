package SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1)).limit(3).collect(Collectors.toList());
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
