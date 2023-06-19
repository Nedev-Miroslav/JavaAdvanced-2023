package A00PreviousExams;

import java.util.Scanner;

public class P02NavyBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[n][n];

        fillStringMatrixWithChars(matrix, scanner);

        int subRow = -1;
        int subCol = -1;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c].equals("S")) {
                    subRow = r;
                    subCol = c;
                }
            }
        }

        String command = scanner.nextLine();


        int mine = 0;
        int ship = 0;


        while (mine < 3 || ship < 3) {
            matrix[subRow][subCol] = "-";

            if (command.equals("up")) {
                subRow--;


            } else if (command.equals("down")) {
                subRow++;


            } else if (command.equals("left")) {
                subCol--;


            } else if (command.equals("right")) {
                subCol++;


            }

            if (matrix[subRow][subCol].equals("*")) {
                mine++;

                if (mine == 3) {
                    matrix[subRow][subCol] = "S";

                    System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n", subRow, subCol);
                    break;
                }

            } else if (matrix[subRow][subCol].equals("C")) {
                ship++;
                matrix[subRow][subCol] = "S";

                if (ship == 3) {

                    System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
                    break;
                }


            }


            matrix[subRow][subCol] = "S";
            command = scanner.nextLine();
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
