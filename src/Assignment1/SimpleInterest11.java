package Assignment1;

import java.util.Arrays;

class SimpleInterest11
{
    public static void main (String[] args)
    {
        if (args.length < 3)
            throw new RuntimeException("Some arguments are missing.\n" +
                    "Arguments should be principal, interest rate, time(years)");
        double[] data = Arrays.stream(args).mapToDouble(Double::parseDouble).toArray();
        System.out.printf("Simple Interest is: %.2f", (data[0]*data[1]*data[2])/100);
    }
}