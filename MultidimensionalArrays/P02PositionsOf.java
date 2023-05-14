package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputRowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = inputRowsAndCols[0];
        int cols = inputRowsAndCols[1];


        int[][] matrix = new int[rows][cols];


        for (int row = 0; row < rows; row++) {
            int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            matrix[row] = input;

        }

        int searchNum = Integer.parseInt(scanner.nextLine());

        boolean isContain = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                if (matrix[row][col] == searchNum) {
                    isContain = true;
                    System.out.println(row + " " + col);
                }


            }
        }


        if (!isContain) {
            System.out.println("not found");
        }


    }
}
