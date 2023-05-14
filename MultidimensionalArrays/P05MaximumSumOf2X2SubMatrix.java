package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05MaximumSumOf2X2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputRowsCols = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(inputRowsCols[0]);
        int cols = Integer.parseInt(inputRowsCols[1]);

        int[][] matrix = new int[rows][cols];


        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        }

        int maxSum = Integer.MIN_VALUE;

        int[][] resultMatrix = new int[2][2];

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {

                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (sum > maxSum) {
                    maxSum = sum;
                    resultMatrix[0][0] = matrix[row][col];
                    resultMatrix[0][1] = matrix[row][col + 1];
                    resultMatrix[1][0] = matrix[row + 1][col];
                    resultMatrix[1][1] = matrix[row + 1][col + 1];


                }


            }
        }

        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);

    }
}

// Второ решение на задачата
// package MultidimensionalArrays;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class P05MaximumSumOf2X2SubMatrix {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int[] inputRowAndCol = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
//
//        int row = inputRowAndCol[0];
//        int col = inputRowAndCol[1];
//
//        int[][] matrix = new int[row][col];
//
//        for (int i = 0; i < matrix.length; i++) {
//            int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
//
//            matrix[i] = numbers;
//
//        }
//
//        int value = Integer.MIN_VALUE;
//
//        int val1 = 0;
//        int val2 = 0;
//        int val3 = 0;
//        int val4 = 0;
//
//        for (int r = 0; r < matrix.length - 1; r++) {
//            for (int c = 0; c < matrix[r].length - 1; c++) {
//
//                int currentSum = matrix[r][c] + matrix[r][c + 1] + matrix[r + 1][c] + matrix[r + 1][c + 1];
//
//                if (currentSum > value) {
//                    value = currentSum;
//                    val1 = matrix[r][c];
//                    val2 = matrix[r][c + 1];
//                    val3 = matrix[r + 1][c];
//                    val4 = matrix[r + 1][c + 1];
//
//
//                }
//
//
//            }
//
//
//        }
//        System.out.println(val1 + " " + val2);
//        System.out.println(val3 + " " + val4);
//        System.out.println(value);
//
//    }
//}