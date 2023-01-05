import java.util.Arrays;

class SumNReverseDigits {
    public static int product(int[] args) {
        int result = 1;
        for (int i: args) result *= i;
        return result;
    }

    public static int reverse(int number) {
        int reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        if (args.length < 1)
            throw new RuntimeException("Please enter the a number as command line argument, to sum and reverse the digits of it.");
        int[] digits = Arrays.stream(args[0].split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Sum of the digits" + Arrays.toString(digits) + " is: " + Arrays.stream(digits).sum());
        System.out.println("Product of the digits" + Arrays.toString(digits) + " is: " + product(digits));
        System.out.println("Reverse of integer" + args[0] + " is: " + reverse(Integer.parseInt(args[0])));
    }
}
