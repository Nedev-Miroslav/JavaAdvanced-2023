package MultidimensionalArrays;

import java.util.Scanner;

public class P03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        String[][] firstMatrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] input = scanner.nextLine().split("\\s+");
            firstMatrix[row] = input;
        }

        String[][] secondMatrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] input = scanner.nextLine().split("\\s+");
            secondMatrix[row] = input;

        }

        String[][] resultMatrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                if (firstMatrix[row][col].equals(secondMatrix[row][col])) {
                    resultMatrix[row][col] = firstMatrix[row][col];
                } else {
                    resultMatrix[row][col] = "*";
                }


            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(resultMatrix[row][col] + " ");

            }
            System.out.println();
        }

    }
}
