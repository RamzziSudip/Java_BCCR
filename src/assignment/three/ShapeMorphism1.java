package assignment.three;

class TestShape {
    void area(float side) {
        System.out.println("The area of the square is " + Math.pow(side, 2) + " sq units");
    }

    void area(float lenght, float width) {
        System.out.println("The area of the rectangle is " + (lenght * width) + " sq units");
    }

    void area(double base, double height) {
        System.out.println("The area of the triangle is " + (base * height) / 2 + " sq units");
    }
}

public class ShapeMorphism1 {
    public static void main(String[] args) {
        TestShape s = new TestShape();
        s.area(12.5f);
        s.area(12.5f, 10f);
        s.area(12.5, 5);
    }
}
