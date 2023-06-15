package MultidimensionalArraysExercise;

import java.util.Scanner;


public class P12TheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        char[][] matrix = new char[rows][cols];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = scanner.nextLine().replaceAll("\\s+", "").toCharArray();

        }
        char newColor = scanner.nextLine().charAt(0);
        String[] input2 = scanner.nextLine().split("\\s+");
        int clickedRow = Integer.parseInt(input2[0]);
        int clickedCol = Integer.parseInt(input2[1]);
        char oldColor = matrix[clickedRow][clickedCol];

        print(matrix, newColor, oldColor, clickedRow, clickedCol);
        for (char[] line : matrix) {
            for (char c : line) {
                System.out.print(c);
            }
            System.out.println();
        }

    }

    private static void print(char[][] matrix, char newColor, char oldColor, int clickedRow, int clickedCol) {
        if (isOutBounds(matrix, clickedRow, clickedCol) || matrix[clickedRow][clickedCol] != oldColor) {
            return;
        }

        matrix[clickedRow][clickedCol] = newColor;
        print(matrix, newColor, oldColor, clickedRow + 1, clickedCol);
        print(matrix, newColor, oldColor, clickedRow - 1, clickedCol);
        print(matrix, newColor, oldColor, clickedRow, clickedCol + 1);
        print(matrix, newColor, oldColor, clickedRow, clickedCol - 1);


    }

    private static boolean isOutBounds(char[][] matrix, int r, int c) {
        return r < 0 || r >= matrix.length || c < 0 || c >= matrix[r].length;

    }

}
