package MultidimensionalArrays;

import java.util.Scanner;

public class P07FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[8][8];


        for (int r = 0; r < matrix.length; r++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = input[c];


            }

        }


        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {

                if (matrix[r][c].equals("q")) {
                    if (isAnotherQueen(matrix, r, c)) {
                        System.out.print(r + " " + c);

                    }


                }


            }
        }


    }

    private static boolean isAnotherQueen(String[][] matrix, int r, int c) {

        if (isInBounds(matrix, r, c + 1)) {
            for (int col = c + 1; col < matrix.length; col++) {
                if (matrix[r][col].equals("q")) {
                    return false;
                }
            }
        }


        if (isInBounds(matrix, r + 1, c)) {
            for (int row = r + 1; row < matrix.length; row++) {
                if (matrix[row][c].equals("q")) {
                    return false;
                }
            }
        }


        if (isInBounds(matrix, r, c - 1)) {
            for (int col = c - 1; col >= 0; col--) {
                if (matrix[r][col].equals("q")) {
                    return false;
                }
            }
        }


        if (isInBounds(matrix, r - 1, c)) {
            for (int row = r - 1; row >= 0; row--) {
                if (matrix[row][c].equals("q")) {
                    return false;
                }
            }
        }


        if (isInBounds(matrix, r + 1, c + 1)) {
            for (int row = r + 1, col = c + 1; row < matrix.length && col < matrix.length; row++, col++) {
                if (matrix[row][col].equals("q")) {
                    return false;
                }

            }

        }

        if (isInBounds(matrix, r - 1, c - 1)) {
            for (int row = r - 1, col = c - 1; row >= 0 && col >= 0; row--, col--) {
                if (matrix[row][col].equals("q")) {
                    return false;
                }

            }

        }


        if (isInBounds(matrix, r + 1, c - 1)) {
            for (int row = r + 1, col = c - 1; row < matrix.length && col >= 0; row++, col--) {
                if (matrix[row][col].equals("q")) {
                    return false;
                }

            }

        }


        if (isInBounds(matrix, r - 1, c + 1)) {
            for (int row = r - 1, col = c + 1; row >= 0 && col < matrix.length; row--, col++) {
                if (matrix[row][col].equals("q")) {
                    return false;
                }

            }

        }


        return true;
    }


    private static boolean isInBounds(String[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length & c >= 0 && c < matrix[r].length;

    }


}

