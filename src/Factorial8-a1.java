class Factorial {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        if (args.length < 1)
            throw new RuntimeException("Number argument is required to find factorial of it! (java Assignment1.Factorial8 5)");
        System.out.println("Factorial of " + args[0] + " is: " + factorial(Integer.parseUnsignedInt(args[0])));
    }

}