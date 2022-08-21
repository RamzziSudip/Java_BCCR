package Assignment1;

import java.util.Scanner;

public class Prime13 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i, j, start, end;
        boolean isprime;

        System.out.print("Enter the start of range( >1 ): ");
        start = sc.nextInt();

        System.out.print("Enter the end of range: ");
        end = sc.nextInt();

        if (start > 1 && end >= start) {
            System.out.print("The prime numbers are: ");
            for (i = start; i <= end; i++) {
                isprime = false;
                for (j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isprime = true;
                        break;
                    }
                }
                if (!isprime) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Please enter starting range and ending range carefully!");
        }

    }
}
