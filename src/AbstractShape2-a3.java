abstract class Shape {
    public abstract void area();

    public abstract void disp();
}

class Rectangle extends Shape {
    private final double length;
    private final double width;
    private double area = 0;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void area() {
        area = this.length * this.width;
    }

    public void disp() {
        System.out.printf("Area of rectangle: %.2f sq units\n", area);
    }

}

class Circle extends Shape {
    private final double radius;
    private double area = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        this.area = Math.PI * Math.pow(this.radius, 2);
    }

    public void disp() {
        System.out.printf("Area of circle: %.2f sq units\n", area);
    }

}

class Triangle extends Shape {
    private final double base;
    private final double height;
    private double area = 0;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void area() {
        this.area = (this.base * this.height) / 2;
    }

    public void disp() {
        System.out.printf("Area of triangle: %.2f sq units\n", area);
    }

}

class AbstractShape {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(12.2, 23.7);
        rect.area();
        rect.disp();

        Circle cir = new Circle(12.2);
        cir.area();
        cir.disp();

        Triangle tri = new Triangle(12.2, 4.8);
        tri.area();
        tri.disp();

    }
}
