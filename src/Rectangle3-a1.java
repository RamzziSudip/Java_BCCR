import java.util.Scanner;

class RectangleShape {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the height and width of the rectangle: ");
        double height = sc.nextDouble(), width = sc.nextDouble();
        System.out.printf("Rectangle area: %.2f\n", height * width);
        System.out.printf("Rectangle perimeter: %.2f", 2 * (height + width));
    }
}
