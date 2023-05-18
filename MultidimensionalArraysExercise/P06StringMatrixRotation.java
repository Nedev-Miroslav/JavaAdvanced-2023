package MultidimensionalArraysExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotationDegree = scanner.nextLine();
        int rotation = (Integer.parseInt(rotationDegree.split("[()]")[1]) % 360);

        String words = scanner.nextLine();

        int row = 0;
        int col = Integer.MIN_VALUE;


        List<String> list = new ArrayList<>();

        while (!words.equals("END")) {
            row++;

            if (words.length() > col) {
                col = words.length();
            }
            list.add(words);
            words = scanner.nextLine();
        }

        char[][] matrix = new char[row][col];

        for (int r = 0; r < matrix.length; r++) {
            String currentWord = list.get(r);
            for (int c = 0; c < matrix[r].length; c++) {
                if (currentWord.length() > c) {
                    matrix[r][c] = currentWord.charAt(c);
                } else {
                    matrix[r][c] = ' ';
                }


            }


        }

        if (rotation == 90) {
            for (int c = 0; c < col; c++) {
                for (int r = row - 1; r >= 0; r--) {

                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        } else if (rotation == 180) {
            for (int r = matrix.length - 1; r >= 0; r--) {
                for (int c = matrix[r].length - 1; c >= 0; c--) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }

        } else if (rotation == 270) {
            for (int c = col - 1; c >= 0; c--) {
                for (int r = 0; r < row; r++) {
                    System.out.print(matrix[r][c]);

                }
                System.out.println();
            }


        } else {
            for (int r = 0; r < row; r++) {
                for (int c = 0; c < col; c++) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }

        }

    }
}