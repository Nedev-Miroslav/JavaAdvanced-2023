package A00PreviousExams.EXAM;

import java.util.Scanner;

public class P02Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputNM = scanner.nextLine().split(",");
        int n = Integer.parseInt(inputNM[0]);
        int m = Integer.parseInt(inputNM[1]);

        String[][] matrix = new String[n][m];

        fillStringMatrixWithChars(matrix, scanner);


        String command = scanner.nextLine();

        int myRow = -1;
        int myCol = -1;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("M")) {
                    myRow = i;
                    myCol = j;
                }
            }
        }
        boolean isOut = false;
        boolean isTrap = false;
        boolean isAllEaten = false;


        int allCheese = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("C")) {
                    allCheese++;
                }
            }
        }


        while (!command.equals("danger")) {
            matrix[myRow][myCol] = "*";

            if (command.equals("up")) {
                if (myRow - 1 >= 0) {
                    if (!matrix[myRow - 1][myCol].equals("@")) {
                        myRow--;
                    }


                } else {
                    matrix[myRow][myCol] = "M";
                    isOut = true;
                    break;
                }


            } else if (command.equals("down")) {
                if (myRow + 1 < n) {
                    if (!matrix[myRow + 1][myCol].equals("@")) {
                        myRow++;
                    }


                } else {
                    matrix[myRow][myCol] = "M";
                    isOut = true;
                    break;
                }


            } else if (command.equals("left")) {
                if (myCol - 1 >= 0) {
                    if (!matrix[myRow][myCol - 1].equals("@")) {
                        myCol--;
                    }


                } else {
                    matrix[myRow][myCol] = "M";
                    isOut = true;
                    break;
                }


            } else if (command.equals("right")) {
                if (myCol + 1 < m) {

                    if (!matrix[myRow][myCol + 1].equals("@")) {
                        myCol++;


                    }
                } else {
                    matrix[myRow][myCol] = "M";
                    isOut = true;
                    break;


                }


            }


            if (matrix[myRow][myCol].equals("C")) {
                matrix[myRow][myCol] = "*";
                allCheese--;
                if (allCheese == 0) {
                    matrix[myRow][myCol] = "M";
                    isAllEaten = true;
                    break;
                }


            } else if (matrix[myRow][myCol].equals("T")) {
                isTrap = true;
                matrix[myRow][myCol] = "M";
                break;
            }


            matrix[myRow][myCol] = "M";
            command = scanner.nextLine();
        }


        if (isTrap) {
            System.out.println("Mouse is trapped!");
        }
        if (isOut) {
            System.out.println("No more cheese for tonight!");
        }
        if (isAllEaten) {
            System.out.println("Happy mouse! All the cheese is eaten, good night!");
        }
        if (allCheese > 0 && !isTrap && !isOut) {
            System.out.println("Mouse will come back later!");


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
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }


}
