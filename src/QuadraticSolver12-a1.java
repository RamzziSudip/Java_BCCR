import java.util.Scanner;

class QuadraticSolver {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the value of a, b and c : ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double determinant = (b * b) - (4 * a * c);
        double sqrt = Math.sqrt(determinant);

        if (determinant > 0) {
            System.out.println("Roots are :: " + (-b + sqrt) / (2 * a) + " and " + (-b - sqrt) / (2 * a));
        } else if (determinant == 0) {
            System.out.println("Root is :: " + (-b + sqrt) / (2 * a));
        } else {
            System.out.println("Roots are not real.");
        }
    }
}