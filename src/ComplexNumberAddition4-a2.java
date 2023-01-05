import java.util.Scanner;

class ComplexNumber {
    private final int real;
    private final int imaginary;

    public ComplexNumber() {
        System.out.print("Enter the real part and imaginary part: ");
        Scanner input = new Scanner(System.in);
        this.real = input.nextInt();
        this.imaginary = input.nextInt();
    }

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        if (this.imaginary < 0) return String.format("%d - %di", this.real, Math.abs(this.imaginary));
        if (this.imaginary == 0) return Integer.toString(this.real);
        return String.format("%d + %di", this.real, this.imaginary);
    }

    public static ComplexNumber add(ComplexNumber first, ComplexNumber second) {
        return new ComplexNumber(
                first.getReal() + second.getReal(),
                first.getImaginary() + second.getImaginary()
        );
    }
}

class ComplexNumberMain {
    public static void main(String[] args) {

        System.out.println("Creating 1st number...");
        ComplexNumber cn1 = new ComplexNumber();
        System.out.println("Creating 2st number..");
        ComplexNumber cn2 = new ComplexNumber();

        System.out.println("Adding (" + cn1 + ") and (" + cn2 + ") ...");
        System.out.println("Result: (" + ComplexNumber.add(cn1, cn2) + ")");
    }
}
