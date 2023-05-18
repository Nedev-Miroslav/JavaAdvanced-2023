package MultidimensionalArraysExercise;

import java.util.Scanner;

public class P05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        fillMatrix(scanner, matrix);

        String command = scanner.nextLine();


        while (!command.equals("END")) {

            String[] separateCommand = command.split("\\s+");

            if (isValidCommand(separateCommand, matrix)) {

                int row1 = Integer.parseInt(separateCommand[1]);
                int col1 = Integer.parseInt(separateCommand[2]);
                int row2 = Integer.parseInt(separateCommand[3]);
                int col2 = Integer.parseInt(separateCommand[4]);

                String firstElement = matrix[row1][col1];
                String secondElement = matrix[row2][col2];

                matrix[row1][col1] = secondElement;
                matrix[row2][col2] = firstElement;

                printStringMatrix(matrix);


            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }

    }

    private static void printStringMatrix(String[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidCommand(String[] command, String[][] matrix) {
        if (command.length != 5) {
            return false;
        }
        if (!command[0].equals("swap")) {
            return false;

        }
        int row1 = Integer.parseInt(command[1]);
        int col1 = Integer.parseInt(command[2]);
        int row2 = Integer.parseInt(command[3]);
        int col2 = Integer.parseInt(command[4]);

        if (row1 < 0 || col1 < 0 || row1 > matrix.length - 1 || col1 > matrix[row1].length - 1) {
            return false;
        }

        if (row2 < 0 || col2 < 0 || row2 > matrix.length - 1 || col2 > matrix[row2].length - 1) {
            return false;
        }
        return true;
    }

    private static void fillMatrix(Scanner scanner, String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");

        }
    }
}
