package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        fillMatrix(scanner, matrix);

        int maxSum = Integer.MIN_VALUE;
        int r = 0;
        int c = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int currentSum = 0;
//
//              Втори вариант
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        currentSum += matrix[i][j];
                    }

                }
//                        Първи вариант
//                    currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
//                            matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
//                            matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];


                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    r = row;
                    c = col;
                }


            }
        }


        printResult(matrix, maxSum, r, c);


    }

    private static void printResult(int[][] matrix, int maxSum, int r, int c) {
        System.out.printf("Sum = %d%n", maxSum);
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(Scanner scanner, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
    }
}
