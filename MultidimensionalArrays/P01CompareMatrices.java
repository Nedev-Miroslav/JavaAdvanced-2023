package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputRowsAndCols1 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int row1 = inputRowsAndCols1[0];
        int col1 = inputRowsAndCols1[1];


        int[][] matrix1 = new int[row1][col1];

        for (int r = 0; r < matrix1.length; r++) {
            String[] num = scanner.nextLine().split("\\s+");
            for (int c = 0; c < matrix1[r].length; c++) {
                matrix1[r][c] = Integer.parseInt(num[c]);


            }
        }

        int[] inputRowCol2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int row2 = inputRowCol2[0];
        int col2 = inputRowCol2[1];

        int[][] matrix2 = new int[row2][col2];

        for (int r = 0; r < matrix2.length; r++) {
            String[] num = scanner.nextLine().split("\\s+");

            for (int c = 0; c < matrix2[r].length; c++) {
                matrix2[r][c] = Integer.parseInt(num[c]);
            }
        }


        if (row1 != row2 || col1 != col2) {
            System.out.println("not equal");
            return;
        }

        boolean isEqual = true;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                int firstElement = matrix1[i][j];
                int secondElement = matrix2[i][j];
                if (firstElement != secondElement) {
                    isEqual = false;
                }


            }
        }

        if (isEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }


    }

}

//   Второ решение на задачата
//package MultidimensionalArrays;
//
//import java.util.Scanner;
//
//public class P01CompareMatrices {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String[] rowsAndCols = scanner.nextLine().split("\\s+");
//        int row = Integer.parseInt(rowsAndCols[0]);
//        int col = Integer.parseInt(rowsAndCols[1]);
//
//        int[][] matrix1 = new int[row][col];
//
//        readMatrix(scanner, row, col, matrix1);
//
//        String[] rowsAndCols2 = scanner.nextLine().split("\\s+");
//        int row2 = Integer.parseInt(rowsAndCols2[0]);
//        int col2 = Integer.parseInt(rowsAndCols2[1]);
//
//        int[][] matrix2 = new int[row2][col2];
//
//        readMatrix(scanner, row2, col2, matrix2);
//
//        if(row != row2 || col != col2) {
//            System.out.println("not equal");
//            return;
//        }
//
//
//        if (areEqual(matrix1, matrix2)) {
//            System.out.println("equal");
//
//        } else {
//            System.out.println("not equal");
//        }
//
//
//    }
//
//    private static boolean areEqual(int[][] matrix1, int[][] matrix2) {
//
//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix1[i].length; j++) {
//                if (matrix1[i][j] != matrix2[i][j]) {
//                    return false;
//                }
//            }
//        }
//
//        return true;
//
//    }
//
//    private static void readMatrix(Scanner scanner, int row, int col, int[][] matrix1) {
//        for (int rows = 0; rows < row; rows++) {
//            String[] input = scanner.nextLine().split("\\s+");
//            for (int cols = 0; cols < col; cols++) {
//                matrix1[rows][cols] = Integer.parseInt(input[cols]);
//            }
//        }
//    }
//
//
//}