package SetsAndMapsAdvanced;

import java.util.*;

public class P05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        TreeMap<String, List<Double>> map = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            String name = input.split("\\s+")[0];
            double grade = Double.parseDouble(input.split("\\s+")[1]);


            map.putIfAbsent(name, new ArrayList<>());
            map.get(name).add(grade);


        }
        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
            System.out.printf("%s -> ", entry.getKey());
            double allGrade = 0;
            for (Double aDouble : entry.getValue()) {
                allGrade += aDouble;
                System.out.printf("%.2f ", aDouble);
            }

            System.out.printf("(avg: %.2f)", allGrade / entry.getValue().size());

            System.out.println();
        }


    }
}
