package A00PreviousExams;

import java.util.Scanner;

public class P02Armory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[n][n];

        fillStringMatrixWithChars(matrix, scanner);

        int officerRow = -1;
        int officerCol = -1;


        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c].equals("A")) {
                    officerRow = r;
                    officerCol = c;
                }
            }
        }

        String command = scanner.nextLine();
        boolean isOut = false;
        int sum = 0;


        while (true) {
            matrix[officerRow][officerCol] = "-";

            if (command.equals("up")) {
                if (officerRow - 1 >= 0) {
                    officerRow--;

                } else {
                    matrix[officerRow][officerCol] = "-";
                    isOut = true;
                    break;
                }


            } else if (command.equals("down")) {

                if (officerRow + 1 < n) {

                    officerRow++;


                } else {
                    matrix[officerRow][officerCol] = "-";
                    isOut = true;
                    break;
                }


            } else if (command.equals("left")) {

                if (officerCol - 1 >= 0) {

                    officerCol--;

                } else {
                    matrix[officerRow][officerCol] = "-";
                    isOut = true;
                    break;
                }


            } else if (command.equals("right")) {

                if (officerCol + 1 < n) {

                    officerCol++;

                } else {
                    matrix[officerRow][officerCol] = "-";
                    isOut = true;
                    break;
                }


            }

            if (Character.isDigit(matrix[officerRow][officerCol].charAt(0))) {
                String strDigit = String.valueOf(matrix[officerRow][officerCol].charAt(0));
                int digit = Integer.parseInt(strDigit);
                sum += digit;
                matrix[officerRow][officerCol] = "-";
                if (sum >= 65) {
                    matrix[officerRow][officerCol] = "A";
                    System.out.println("Very nice swords, I will come back for more!");
                    break;
                }

            }
            if (matrix[officerRow][officerCol].equals("M")) {
                matrix[officerRow][officerCol] = "-";
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j].equals("M")) {
                            officerRow = i;
                            officerCol = j;
                            matrix[officerRow][officerCol] = "A";
                        }
                    }
                }


            }


            matrix[officerRow][officerCol] = "A";
            command = scanner.nextLine();
        }

        if (isOut) {
            System.out.println("I do not need more swords!");
        }

        System.out.printf("The king paid %d gold coins.%n", sum);
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