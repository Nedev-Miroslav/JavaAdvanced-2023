package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        fillMatrix(scanner, matrix);

        int sum1 = sumPrimeDiagonal(matrix);
        int sum2 = sumSecondDiagonal(matrix);

        int result = Math.abs(sum1 - sum2);
        System.out.println(result);

    }

    private static int sumSecondDiagonal(int[][] matrix) {
        int sumOfSecondDiagonal = 0;
        for (int row = matrix.length - 1, col = 0; col < matrix.length; row--, col++) {
            sumOfSecondDiagonal += matrix[row][col];
        }

        return sumOfSecondDiagonal;
    }

    private static int sumPrimeDiagonal(int[][] matrix) {
        int sumOfPrimaryDiagonal = 0;
//        Второ решение
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(col == matrix.length - row - 1) {
                    sumOfPrimaryDiagonal += matrix[row][row];
                }
            }
        }
//        Мое решение
//        for (int rows = 0; rows < matrix.length; rows++) {
//            sumOfPrimaryDiagonal += matrix[rows][rows];
//        }
        return sumOfPrimaryDiagonal;
    }

    private static void fillMatrix(Scanner scanner, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
    }
}
