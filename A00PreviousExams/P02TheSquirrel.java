package A00PreviousExams;

import java.util.Scanner;

public class P02TheSquirrel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        String[] command = scanner.nextLine().split(", ");

        String[][] matrix = new String[n][n];

        fillStringMatrixWithChars(matrix, scanner);

        int squirrelRow = -1;
        int squirrelCol = -1;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c].equals("s")) {
                    squirrelRow = r;
                    squirrelCol = c;
                }
            }
        }

        int hazelnut = 0;
        boolean isOutOrCaught = false;

        for (String currentCommand : command) {


            if (currentCommand.equals("up")) {


                if (squirrelRow - 1 >= 0) {
                    matrix[squirrelRow][squirrelCol] = "*";
                    squirrelRow--;

                } else {
                    matrix[squirrelRow][squirrelCol] = "*";
                    System.out.println("The squirrel is out of the field.");
                    isOutOrCaught = true;
                    break;
                }


            } else if (currentCommand.equals("down")) {

                if (squirrelRow + 1 < n) {
                    matrix[squirrelRow][squirrelCol] = "*";
                    squirrelRow++;

                } else {
                    matrix[squirrelRow][squirrelCol] = "*";
                    System.out.println("The squirrel is out of the field.");
                    isOutOrCaught = true;
                    break;
                }


            } else if (currentCommand.equals("left")) {

                if (squirrelCol - 1 >= 0) {
                    matrix[squirrelRow][squirrelCol] = "*";
                    squirrelCol--;

                } else {
                    matrix[squirrelRow][squirrelCol] = "*";
                    System.out.println("The squirrel is out of the field.");
                    isOutOrCaught = true;
                    break;
                }


            } else if (currentCommand.equals("right")) {

                if (squirrelCol + 1 < n) {
                    matrix[squirrelRow][squirrelCol] = "*";
                    squirrelCol++;

                } else {
                    matrix[squirrelRow][squirrelCol] = "*";
                    System.out.println("The squirrel is out of the field.");
                    isOutOrCaught = true;
                    break;
                }


            }


            if (matrix[squirrelRow][squirrelCol].equals("h")) {
                hazelnut++;

                if (hazelnut == 3) {
                    System.out.println("Good job! You have collected all hazelnuts!");
                    break;
                }

            } else if (matrix[squirrelRow][squirrelCol].equals("t")) {
                matrix[squirrelRow][squirrelCol] = "*";
                isOutOrCaught = true;
                System.out.println("Unfortunately, the squirrel stepped on a trap...");
                break;
            }


            matrix[squirrelRow][squirrelCol] = "s";


        }

        if (hazelnut < 3 && !isOutOrCaught) {
            System.out.println("There are more hazelnuts to collect.");
        }
        System.out.printf("Hazelnuts collected: %d", hazelnut);


    }

    private static void fillStringMatrixWithChars(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");


        }
    }


}
