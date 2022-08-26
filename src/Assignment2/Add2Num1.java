package Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Add2Num1 {
    public static void v1() {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt(), y = reader.nextInt();
        System.out.println("Sum of " + x + " and " + y + ": " + (x + y));
    }

    public static void v2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Sum of " + numbers[0] + " and " + numbers[1] + ": " + Arrays.stream(numbers).sum());
    }

    public static void main(String[] args) throws IOException {
        RuntimeException error = new RuntimeException("""
                Choose the version in command line argument:
                [1]Using Scanner
                [2]Using BufferedReader""");

        if (args.length < 1)
            throw error;
        System.out.print("Enter two numbers: ");
        switch (args[0]) {
            case "1" -> v1();
            case "2" -> v2();
            default -> throw error;
        }
    }
}
