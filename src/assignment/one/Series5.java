package assignment.one;

import java.util.Scanner;

class Series5 {
    static Scanner sc = new Scanner(System.in);

    static double findSum(int n) {
        double sum = 0;
        for (double i = 1; i <= n; i++) sum += 1 / i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("1 + 1/2 + 1/3 + 1/4 + ... + 1/n");
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.printf("Sum upto " + n + "th value in the series is: %.2f", findSum(n));
    }
}