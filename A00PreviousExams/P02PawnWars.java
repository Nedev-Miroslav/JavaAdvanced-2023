package A00PreviousExams;

import java.util.Scanner;

public class P02PawnWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] chesMatrix = new String[8][8];

        int n = 8;

        for (int row = 0; row < chesMatrix.length; row++) {

            int startLetter = 97;
            for (int col = 0; col < chesMatrix.length; col++) {


                char symbol = (char) startLetter;
                String element = String.format("%c%d", symbol, n);
                startLetter++;
                chesMatrix[row][col] = element;

            }
            n--;

        }

        String[][] matrix = new String[8][8];
        fillStringMatrixWithChars(matrix, scanner);


        int whiteRow = -1;
        int whiteCol = -1;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                if (matrix[r][c].equals("w")) {
                    whiteRow = r;
                    whiteCol = c;
                }
            }
        }


        int blackRow = -1;
        int blackCol = -1;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                if (matrix[r][c].equals("b")) {
                    blackRow = r;
                    blackCol = c;
                }
            }
        }


        while (true) {

            if (isInBounds(matrix, whiteRow - 1, whiteCol - 1)) {
                if (matrix[whiteRow - 1][whiteCol - 1].equals("b")) {
                    matrix[whiteRow][whiteCol] = "-";
                    matrix[whiteRow - 1][whiteCol - 1] = "w";
                    String elements = chesMatrix[whiteRow - 1][whiteCol - 1];
                    System.out.printf("Game over! White capture on %s.%n", elements);
                    break;
                }

            }

            if (isInBounds(matrix, whiteRow - 1, whiteCol + 1)) {
                if (matrix[whiteRow - 1][whiteCol + 1].equals("b")) {
                    matrix[whiteRow][whiteCol] = "-";
                    matrix[whiteRow - 1][whiteCol + 1] = "w";
                    String elements = chesMatrix[whiteRow - 1][whiteCol + 1];
                    System.out.printf("Game over! White capture on %s.%n", elements);
                    break;
                }

            }


            if (whiteRow - 1 > 0) {
                matrix[whiteRow][whiteCol] = "-";
                whiteRow--;
                matrix[whiteRow][whiteCol] = "w";
            } else {
                matrix[whiteRow][whiteCol] = "-";
                matrix[whiteRow - 1][whiteCol] = "w";
                String elements = chesMatrix[whiteRow - 1][whiteCol];
                System.out.printf("Game over! White pawn is promoted to a queen at %s.%n", elements);
                break;
            }

            if (isInBounds(matrix, blackRow + 1, blackCol - 1)) {
                if (matrix[blackRow + 1][blackCol - 1].equals("w")) {
                    matrix[blackRow][blackCol] = "-";
                    matrix[blackRow + 1][blackCol - 1] = "b";
                    String elements = chesMatrix[blackRow + 1][blackCol - 1];
                    System.out.printf("Game over! Black capture on %s.%n", elements);
                    break;
                }

            }

            if (isInBounds(matrix, blackRow + 1, blackCol + 1)) {
                if (matrix[blackRow + 1][blackCol + 1].equals("w")) {
                    matrix[blackRow][blackCol] = "-";
                    matrix[blackRow + 1][blackCol + 1] = "b";
                    String elements = chesMatrix[blackRow + 1][blackCol + 1];
                    System.out.printf("Game over! Black capture on %s.%n", elements);
                    break;
                }

            }

            if (blackRow + 1 < matrix.length - 1) {
                matrix[blackRow][blackCol] = "-";
                blackRow++;
                matrix[blackRow][blackCol] = "b";
            } else {
                matrix[blackRow][blackCol] = "-";
                matrix[blackRow + 1][blackCol] = "b";
                String elements = chesMatrix[blackRow + 1][blackCol];
                System.out.printf("Game over! Black pawn is promoted to a queen at %s.", elements);
                break;
            }


        }


    }

    private static void fillStringMatrixWithChars(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");


        }
    }

    private static boolean isInBounds(String[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length & c >= 0 && c < matrix[r].length;

    }


}