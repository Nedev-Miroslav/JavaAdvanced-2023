package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P011ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputRowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = inputRowsAndCols[0];
        int cols = inputRowsAndCols[1];

        int[][] matrix = new int[rows][cols];

        fillMatrix(scanner, rows, matrix);

        int row = rows - 1;
        int col = cols - 1;

        while (row != -1) {
            int r = row;
            int c = col;
            while (c < cols && r >= 0) {
                System.out.print(matrix[r--][c++] + " ");
            }
            System.out.println();
            col--;
            if (col == -1) {
                col = 0;
                row--;
            }
        }
    }

    private static boolean isInbounds(int row, int col, int[][] matrix) {
        return row < 0 || col < 0 || row > matrix.length - 1 || col > matrix[0].length - 1;
    }


    private static void fillMatrix(Scanner scanner, int rows, int[][] matrix) {
        for (int row = 0; row < rows; row++) {
            int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            matrix[row] = input;

        }
    }
}
