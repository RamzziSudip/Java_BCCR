package Assignment1;

import java.util.Scanner;

public class SumAvg16 {
    public static void main(String[] args) {
        int num, n, i, sum = 0, avg;

        Scanner x = new Scanner(System.in);
        System.out.print("Enter the total amount of numbers: ");
        num = x.nextInt();

        int[] arr = new int[num];
        System.out.print("Enter the numbers: ");
        for (i = 0; i < num; i++) {
            n = x.nextInt();
            arr[i] = n;
        }

        for (int data : arr) sum += data;
        avg = sum / arr.length;
        System.out.println("The sum of the numbers is " + sum + " and the average is " + avg);
    }
}
