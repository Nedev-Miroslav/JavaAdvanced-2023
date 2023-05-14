package MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][];


        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();


        }

        int[] wrongNum = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int numberToReplace = matrix[wrongNum[0]][wrongNum[1]];

        List<int[]> result = new ArrayList<>();

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == numberToReplace) {
                    int replacement = getSum(matrix, r, c, numberToReplace);
                    result.add(new int[]{r, c, replacement});


                }

            }


        }
        for (int[] results : result) {
            matrix[results[0]][results[1]] = results[2];
        }

        for (int[] arr : matrix) {
            for (int r : arr) {
                System.out.print(r + " ");
            }
            System.out.println();
        }

    }

    private static int getSum(int[][] matrix, int r, int c, int numberToReplace) {
        int sum = 0;

        if (isInBounds(matrix, r + 1, c) && matrix[r + 1][c] != numberToReplace) {
            sum += matrix[r + 1][c];
        }

        if (isInBounds(matrix, r - 1, c) && matrix[r - 1][c] != numberToReplace) {
            sum += matrix[r - 1][c];
        }

        if (isInBounds(matrix, r, c - 1) && matrix[r][c - 1] != numberToReplace) {
            sum += matrix[r][c - 1];
        }

        if (isInBounds(matrix, r, c + 1) && matrix[r][c + 1] != numberToReplace) {
            sum += matrix[r][c + 1];
        }


        return sum;


    }


    private static boolean isInBounds(int[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length & c >= 0 && c < matrix[r].length;

    }


}




