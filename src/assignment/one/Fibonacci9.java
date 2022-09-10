package assignment.one;

import java.util.Scanner;

class Fibonacci9 {
    static Scanner sc = new Scanner(System.in);
    static long n1 = 0, n2 = 1, n3 = 0;

    public static void Fib(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            Fib(count - 1);
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter the nth value: ");
        int count = sc.nextInt();
        System.out.print("\n" + n1 + " " + n2);
        Fib(count - 2);
    }
}
