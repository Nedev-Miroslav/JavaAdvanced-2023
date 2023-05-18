package MultidimensionalArraysExercise;

import java.util.Scanner;

public class P01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[n][n];


        if (pattern.equals("A")) {

            matrixByPatternA(matrix);

        } else if (pattern.equals("B")) {

            matrixByPatternB(matrix);

        }


        printMatrix(matrix);


    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


    private static void matrixByPatternA(int[][] matrix) {
        int start = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix[col].length; row++) {
                matrix[row][col] = start;
                start++;
            }

        }
    }

    private static void matrixByPatternB(int[][] matrix) {
        int start = 1;
        for (int col = 0; col < matrix.length; col++) {

            if ((col + 1) % 2 != 0) {
                for (int row = 0; row < matrix[col].length; row++) {
                    matrix[row][col] = start;
                    start++;
                }


            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = start;
                    start++;
                }


            }


        }


    }


}

