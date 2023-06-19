package A00PreviousExams;

import java.util.Scanner;

public class P02Bee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[n][n];

        fillStringMatrixWithChars(matrix, scanner);


        String command = scanner.nextLine();


        int beeRow = -1;
        int beeCol = -1;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c].equals("B")) {
                    beeRow = r;
                    beeCol = c;
                }
            }
        }
        boolean isOut = false;
        int flowerCount = 0;


        while (!command.equals("End")) {
            matrix[beeRow][beeCol] = ".";

            if (command.equals("up")) {
                if (beeRow - 1 >= 0) {
                    beeRow--;

                } else {
                    matrix[beeRow][beeCol] = ".";
                    isOut = true;
                    break;
                }


            } else if (command.equals("down")) {

                if (beeRow + 1 < n) {

                    beeRow++;


                } else {
                    matrix[beeRow][beeCol] = ".";
                    isOut = true;
                    break;
                }


            } else if (command.equals("left")) {

                if (beeCol - 1 >= 0) {

                    beeCol--;

                } else {
                    matrix[beeRow][beeCol] = ".";
                    isOut = true;
                    break;
                }


            } else if (command.equals("right")) {

                if (beeCol + 1 < n) {

                    beeCol++;

                } else {
                    matrix[beeRow][beeCol] = ".";
                    isOut = true;
                    break;
                }


            }


            if (matrix[beeRow][beeCol].equals("f")) {

                flowerCount++;

            } else if (matrix[beeRow][beeCol].equals("O")) {
                matrix[beeRow][beeCol] = ".";
                if (command.equals("up")) {
                    beeRow--;

                } else if (command.equals("down")) {
                    beeRow++;

                } else if (command.equals("left")) {
                    beeCol--;

                } else if (command.equals("right")) {
                    beeCol++;
                }
                if (matrix[beeRow][beeCol].equals("f")) {

                    flowerCount++;
                }
            }

            matrix[beeRow][beeCol] = "B";
            command = scanner.nextLine();
        }
        if (isOut) {
            System.out.println("The bee got lost!");
        }
        if (flowerCount < 5) {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - flowerCount);
        } else {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", flowerCount);
        }

        printMatrix(matrix);

    }

    private static void fillStringMatrixWithChars(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");


        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

}
