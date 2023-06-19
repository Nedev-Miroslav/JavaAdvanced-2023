package A00PreviousExams;

import java.util.Scanner;

public class P02PresentDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[n][n];

        fillStringMatrixWithChars(matrix, scanner);

        int santaRow = -1;
        int santaCol = -1;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c].equals("S")) {
                    santaRow = r;
                    santaCol = c;
                }
            }
        }


        int niceChildrenCont = 0;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c].equals("V")) {
                    niceChildrenCont++;
                }
            }
        }


        String command = scanner.nextLine();

        int resivenGigts = 0;
        int amountOfGifts = m;
        boolean isLeftGifts = true;
        while (!command.equals("Christmas morning")) {

            matrix[santaRow][santaCol] = "-";


            if (command.equals("up")) {

                if (santaRow - 1 >= 0) {
                    santaRow--;


                }


            } else if (command.equals("down")) {

                if (santaRow + 1 < n) {
                    santaRow++;

                }


            } else if (command.equals("left")) {

                if (santaCol - 1 >= 0) {
                    santaCol--;

                }


            } else if (command.equals("right")) {

                if (santaCol + 1 < n) {
                    santaCol++;

                }


            }


            if (matrix[santaRow][santaCol].equals("X")) {
                matrix[santaRow][santaCol] = "-";


            }
            if (matrix[santaRow][santaCol].equals("V")) {
                matrix[santaRow][santaCol] = "-";
                niceChildrenCont--;
                resivenGigts++;
                amountOfGifts--;


            }
            if (matrix[santaRow][santaCol].equals("C")) {
                matrix[santaRow][santaCol] = "-";

                if (matrix[santaRow - 1][santaCol].equals("V")) {
                    matrix[santaRow - 1][santaCol] = "-";
                    niceChildrenCont--;
                    resivenGigts++;
                    amountOfGifts--;
                    matrix[santaRow][santaCol] = "S";
                    if (amountOfGifts <= 0) {
                        isLeftGifts = false;
                        break;
                    }

                }
                if (matrix[santaRow + 1][santaCol].equals("V")) {
                    matrix[santaRow + 1][santaCol] = "-";
                    niceChildrenCont--;
                    resivenGigts++;
                    amountOfGifts--;
                    matrix[santaRow][santaCol] = "S";
                    if (amountOfGifts <= 0) {
                        isLeftGifts = false;
                        break;
                    }

                }
                if (matrix[santaRow][santaCol - 1].equals("V")) {
                    matrix[santaRow][santaCol - 1] = "-";
                    niceChildrenCont--;
                    resivenGigts++;
                    amountOfGifts--;
                    matrix[santaRow][santaCol] = "S";
                    if (amountOfGifts <= 0) {
                        isLeftGifts = false;
                        break;
                    }
                }
                if (matrix[santaRow][santaCol + 1].equals("V")) {
                    matrix[santaRow][santaCol + 1] = "-";
                    niceChildrenCont--;
                    resivenGigts++;
                    amountOfGifts--;
                    matrix[santaRow][santaCol] = "S";
                    if (amountOfGifts <= 0) {
                        isLeftGifts = false;
                        break;
                    }
                }
                if (matrix[santaRow - 1][santaCol].equals("X")) {
                    matrix[santaRow - 1][santaCol] = "-";
                    resivenGigts++;
                    amountOfGifts--;
                    matrix[santaRow][santaCol] = "S";
                    if (amountOfGifts <= 0) {
                        isLeftGifts = false;
                        break;
                    }
                }
                if (matrix[santaRow + 1][santaCol].equals("X")) {
                    matrix[santaRow + 1][santaCol] = "-";
                    resivenGigts++;
                    amountOfGifts--;
                    matrix[santaRow][santaCol] = "S";
                    if (amountOfGifts <= 0) {
                        isLeftGifts = false;
                        break;
                    }
                }
                if (matrix[santaRow][santaCol - 1].equals("X")) {
                    matrix[santaRow][santaCol - 1] = "-";
                    resivenGigts++;
                    amountOfGifts--;
                    matrix[santaRow][santaCol] = "S";
                    if (amountOfGifts <= 0) {
                        isLeftGifts = false;
                        break;
                    }
                }
                if (matrix[santaRow][santaCol + 1].equals("X")) {
                    matrix[santaRow][santaCol + 1] = "-";
                    resivenGigts++;
                    amountOfGifts--;
                    matrix[santaRow][santaCol] = "S";
                    if (amountOfGifts <= 0) {
                        isLeftGifts = false;
                        break;
                    }
                }


            }

            matrix[santaRow][santaCol] = "S";
            if (amountOfGifts <= 0) {
                isLeftGifts = false;
                break;
            }


            command = scanner.nextLine();
        }


        if (!isLeftGifts) {
            System.out.println("Santa ran out of presents!");
        }
        printMatrix(matrix);

        if (niceChildrenCont <= 0) {
            System.out.printf("Good job, Santa! %d happy nice kid/s.%n", resivenGigts);
        } else {
            System.out.printf("No presents for %d nice kid/s.%n", niceChildrenCont);
        }

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

