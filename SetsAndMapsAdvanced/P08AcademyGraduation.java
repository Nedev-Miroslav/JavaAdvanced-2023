package SetsAndMapsAdvanced;


import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Double[]> map = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

            map.putIfAbsent(name, new Double[grades.length]);

            for (int j = 0; j < grades.length; j++) {
                map.get(name)[j] = grades[j];
            }


        }


        for (Map.Entry<String, Double[]> entry : map.entrySet()) {
            System.out.printf("%s is graduated with ", entry.getKey());

            double result = 0.0;
            for (int i = 0; i < entry.getValue().length; i++) {
                result += entry.getValue()[i];
            }
            DecimalFormat format = new DecimalFormat("####.#####################################");
            double finalResult = result / entry.getValue().length;
            System.out.printf("%s", format.format(finalResult));
            System.out.println();


        }


    }
}
