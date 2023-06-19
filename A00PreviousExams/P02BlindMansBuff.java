package A00PreviousExams;

import java.util.Scanner;

public class P02BlindMansBuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        fillStringMatrixWithChars(matrix, scanner);

        int myRow = 0;
        int myCol = 0;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("B")) {
                    myRow = i;
                    myCol = j;
                }
            }
        }

        String command = scanner.nextLine();
        int count = 0;
        int totalMove = 0;
        while (!command.equals("Finish")) {

            if (command.equals("up")) {
                if (myRow - 1 >= 0 && !matrix[myRow - 1][myCol].equals("O")) {
                    myRow--;
                    totalMove++;
                }

                if (matrix[myRow][myCol].equals("P")) {
                    count++;
                    matrix[myRow][myCol] = "-";
                }


            } else if (command.equals("down")) {
                if (myRow + 1 < rows && !matrix[myRow + 1][myCol].equals("O")) {
                    myRow++;
                    totalMove++;
                }
                if (matrix[myRow][myCol].equals("P")) {
                    count++;
                    matrix[myRow][myCol] = "-";
                }


            } else if (command.equals("left")) {
                if (myCol - 1 >= 0 && !matrix[myRow][myCol - 1].equals("O")) {
                    myCol--;
                    totalMove++;
                }
                if (matrix[myRow][myCol].equals("P")) {
                    count++;
                    matrix[myRow][myCol] = "-";
                }

            } else if (command.equals("right")) {
                if (myCol + 1 < cols && !matrix[myRow][myCol + 1].equals("O")) {
                    myCol++;
                    totalMove++;
                }
                if (matrix[myRow][myCol].equals("P")) {
                    count++;
                    matrix[myRow][myCol] = "-";
                }


            }

            if (count == 3) {
                break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d Moves made: %d", count, totalMove);


    }


    private static void fillStringMatrixWithChars(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");


        }
    }


}