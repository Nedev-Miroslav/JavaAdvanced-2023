package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];


        for (int row = 0; row < n; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();

        for (int r = matrix.length - 1, c = 0; c < matrix.length && r >= 0; r--, c++) {
            System.out.print(matrix[r][c] + " ");
        }


    }
}


// Второ решение
// package MultidimensionalArrays;
//
//import java.util.Scanner;
//
//public class P06PrintDiagonalsOfSquareMatrix {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = Integer.parseInt(scanner.nextLine());
//
//        int[][] matrix = new int[n][n];
//
//
//        for (int r = 0; r < n; r++) {
//            String[] input = scanner.nextLine().split(" ");
//            for (int c = 0; c < n; c++) {
//                matrix[r][c] = Integer.parseInt(input[c]);
//            }
//        }
//
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.print(matrix[i][i] + " ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.print(matrix[n - 1][i] + " ");
//            n--;
//        }
//
//
//    }
//}