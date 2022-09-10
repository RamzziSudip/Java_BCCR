package assignment.one;

import java.util.Scanner;

class SumSeries10 {
    static Scanner sc = new Scanner(System.in);

    static long sum(int x, int n) {
        long i, total = 1, multi = x;
        System.out.print("1 + ");
        for (i = 1; i < n; i++) {
            total = total + multi;
            if (i == 1)
                System.out.print(x);
            else System.out.print(x+"^"+i);
            multi *= x;
            if (i + 1 != n)
                System.out.print(" + ");
            else System.out.print(" = ");
        }
        return total;
    }

    public static void main(String[] args) {

        System.out.println("Series (1 + x + x^2 + x^3 + x^4 + ... up to n-th terms)");
        System.out.print("Enter the value of x and n: ");
        System.out.println(sum(sc.nextInt(), sc.nextInt()));
    }
}