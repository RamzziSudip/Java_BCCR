package Assignment2;

import java.util.Scanner;

class ComplexNumber {
    public int real;
    public int imaginary;
    static Scanner input = new Scanner(System.in);

    public ComplexNumber() {
        System.out.print("Enter the real part and imaginary part: ");
        this.real = input.nextInt();
        this.imaginary = input.nextInt();
    }

    @Override
    public String toString() {
        if (this.imaginary < 0) return String.format("%d - %di", this.real, Math.abs(this.imaginary));
        if (this.imaginary == 0) return Integer.toString(this.real);
        return String.format("%d + %di", this.real, this.imaginary);
    }

    public static ComplexNumber add(ComplexNumber first, ComplexNumber second) {
        first.real += second.real;
        first.imaginary += second.imaginary;
        return first;
    }
}

class ComplexNumberMain {
    public static void main(String[] args) {

        System.out.println("Creating 1st number...");
        ComplexNumber cn1 = new ComplexNumber();
        System.out.println("Creating 2st number..");
        ComplexNumber cn2 = new ComplexNumber();
        System.out.println("Adding (" + cn1 + ") and (" + cn2 + ") ...");
        System.out.println("Result: " + ComplexNumber.add(cn1, cn2));
    }
}
