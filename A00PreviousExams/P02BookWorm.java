package A00PreviousExams;

import java.util.Scanner;

public class P02BookWorm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strInput = scanner.nextLine();
        StringBuilder sb = new StringBuilder(strInput);

        int n = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[n][n];

        fillStringMatrixWithChars(matrix, scanner);


        String command = scanner.nextLine();


        int wormRow = -1;
        int wormCol = -1;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c].equals("P")) {
                    wormRow = r;
                    wormCol = c;
                }
            }
        }


        while (!command.equals("end")) {
            matrix[wormRow][wormCol] = "-";

            if (command.equals("up")) {

                if (wormRow - 1 >= 0) {
                    wormRow--;


                } else {
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                }


            } else if (command.equals("down")) {

                if (wormRow + 1 < n) {
                    wormRow++;

                } else {
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                }


            } else if (command.equals("left")) {

                if (wormCol - 1 >= 0) {
                    wormCol--;

                } else {
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                }


            } else if (command.equals("right")) {

                if (wormCol + 1 < n) {
                    wormCol++;

                } else {
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                }


            }


            if (Character.isLetter(matrix[wormRow][wormCol].charAt(0))) {

                char current = matrix[wormRow][wormCol].charAt(0);
                sb.append(current);
                matrix[wormRow][wormCol] = "-";

            }


            matrix[wormRow][wormCol] = "P";
            command = scanner.nextLine();
        }


        System.out.println(sb);
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
