package MultidimensionalArraysExercise;

import java.util.Scanner;

public class P02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);


        String[][] matrix = new String[rows][cols];

        fillStringMatrixWithChars(matrix);

        printMatrix(matrix);


    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillStringMatrixWithChars(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                char firstAndLast = (char) (97 + row);
                char middle = (char) (97 + row + col);

                matrix[row][col] = "" + firstAndLast + middle + firstAndLast;

            }
        }
    }
}
