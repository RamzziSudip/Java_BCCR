package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixArithmetic22 {
    static Scanner sc = new Scanner(System.in);
    static int[][] a = {{1, 4, 1}, {3, 2, 6}, {2, 3, 8}};
    static int[][] b = {{5, 1, 1}, {2, 0, 2}, {3, 1, 3}};
    int[][] c = new int[3][3];

    public void multiplication() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }

    public void plusOrMinus(boolean option) {
        // option = true then perform addition else subtraction.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] += option ? a[i][j] + b[i][j] : a[i][j] - b[i][j];
            }
        }
    }

    public static void main(String[] args) {
        MatrixArithmetic22 matrix = new MatrixArithmetic22();

        System.out.println("Matrix A");
        for (int[] ints : a) System.out.println(Arrays.toString(ints));
        System.out.println();

        System.out.println("Matrix B");
        for (int[] ints : b) System.out.println(Arrays.toString(ints));
        System.out.println();

        System.out.println("Choose an option to perform operation upon A and B:");
        System.out.println("[1] Multiplication\n[2] Addition\n[3] Subtraction");
        System.out.print("> ");

        switch (sc.nextByte()) {
            case 1 -> matrix.multiplication();
            case 2 -> matrix.plusOrMinus(true);
            case 3 -> matrix.plusOrMinus(false);
            default -> System.out.println("Invalid choice. Please select among 1, 2, 3!");
        }

        System.out.println("Result:");
        for (int[] ints : matrix.c) System.out.println(Arrays.toString(ints));
    }
}
