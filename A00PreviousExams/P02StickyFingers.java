package A00PreviousExams;

import java.util.Scanner;

public class P02StickyFingers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] command = scanner.nextLine().split(",");

        String[][] matrix = new String[n][n];

        fillStringMatrixWithChars(matrix, scanner);

        int burglerRow = -1;
        int burglerCol = -1;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c].equals("D")) {
                    burglerRow = r;
                    burglerCol = c;
                }
            }
        }


        int totalStolenMoney = 0;
        boolean getCaught = false;

        for (String currentCommand : command) {


            if (currentCommand.equals("up")) {

                if (burglerRow - 1 >= 0) {
                    matrix[burglerRow][burglerCol] = "+";
                    burglerRow--;
                } else {
                    System.out.println("You cannot leave the town, there is police outside!");
                }


            } else if (currentCommand.equals("down")) {

                if (burglerRow + 1 < n) {
                    matrix[burglerRow][burglerCol] = "+";
                    burglerRow++;
                } else {
                    System.out.println("You cannot leave the town, there is police outside!");
                }


            } else if (currentCommand.equals("left")) {

                if (burglerCol - 1 >= 0) {
                    matrix[burglerRow][burglerCol] = "+";
                    burglerCol--;
                } else {
                    System.out.println("You cannot leave the town, there is police outside!");
                }


            } else if (currentCommand.equals("right")) {

                if (burglerCol + 1 < n) {
                    matrix[burglerRow][burglerCol] = "+";
                    burglerCol++;
                } else {
                    System.out.println("You cannot leave the town, there is police outside!");
                }


            }


            if (matrix[burglerRow][burglerCol].equals("$")) {
                matrix[burglerRow][burglerCol] = "+";

                int stolenMoney = burglerRow * burglerCol;
                totalStolenMoney += stolenMoney;

                System.out.printf("You successfully stole %d$.%n", stolenMoney);

            } else if (matrix[burglerRow][burglerCol].equals("P")) {
                matrix[burglerRow][burglerCol] = "#";
                System.out.printf("You got caught with %d$, and you are going to jail.%n", totalStolenMoney);
                getCaught = true;
                break;


            }
            matrix[burglerRow][burglerCol] = "D";

        }


        if (!getCaught) {
            System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", totalStolenMoney);
        }

        printMatrix(matrix);


    }


    private static void fillStringMatrixWithChars(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split(" ");


        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
