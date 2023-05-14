package StacksAndQueuesExercise;

import java.util.Scanner;

public class P06RecursiveFibonacciWithRecursion {
    private static long[] memory;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        memory = new long[n + 1];
        long result = fid(n);
        System.out.println(result);

    }

    private static long fid(int n) {
        if (n < 2) {
            return 1;
        }
        if (memory[n] != 0) {
            return memory[n];
        }
        memory[n] = fid(n - 1) + fid(n - 2);
        return memory[n];

    }
}
