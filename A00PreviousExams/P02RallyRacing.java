package A00PreviousExams;

import java.util.Scanner;

public class P02RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String racingNumber = scanner.nextLine();

        String[][] matrix = new String[n][n];

        fillStringMatrixWithChars(matrix, scanner);

        int carRow = 0;
        int carCol = 0;

        boolean isFinished = false;


        String command = scanner.nextLine();


        int kmCount = 0;
        matrix[carRow][carCol] = "C";
        while (!command.equals("End")) {

            kmCount += 10;


            if (command.equals("up")) {
                matrix[carRow][carCol] = ".";
                carRow--;

            } else if (command.equals("down")) {
                matrix[carRow][carCol] = ".";
                carRow++;

            } else if (command.equals("right")) {
                matrix[carRow][carCol] = ".";
                carCol++;

            } else if (command.equals("left")) {
                matrix[carRow][carCol] = ".";
                carCol--;

            }

            if (matrix[carRow][carCol].equals("T")) {
                kmCount += 20;
                matrix[carRow][carCol] = ".";
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j].equals("T")) {
                            carRow = i;
                            carCol = j;
                            matrix[carRow][carCol] = "C";
                        }
                    }
                }

            } else if (matrix[carRow][carCol].equals("F")) {
                matrix[carRow][carCol] = "C";
                isFinished = true;
                break;
            }

            matrix[carRow][carCol] = "C";
            command = scanner.nextLine();
        }

        if (isFinished) {
            System.out.printf("Racing car %s finished the stage!%n", racingNumber);
        } else {
            System.out.printf("Racing car %s DNF.%n", racingNumber);
        }
        System.out.printf("Distance covered %d km.%n", kmCount);

        printMatrix(matrix);


    }

    private static void fillStringMatrixWithChars(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");


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
