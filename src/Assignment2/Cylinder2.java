package Assignment2;

import java.util.Scanner;

class Cylinder {
    private final double height;
    private final double radius;
    public static final double pi = 22.0 / 7;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double volume() {
        return pi * Math.pow(this.radius, 2) * this.height;
    }
    public double area() {
        return 2 * pi * this.radius * (this.height + this.radius);
    }
}

class CylinderMain {
    public static void main(String[] args) {
        System.out.print("[!] Enter height and radius to create a new cylinder:\n > ");
        Scanner sc = new Scanner(System.in);
        Cylinder cylinder = new Cylinder(sc.nextDouble(), sc.nextDouble());
        System.out.printf("Volume of the cylinder: %.2f\n", cylinder.volume());
        System.out.printf("Area of the cylinder: %.2f", cylinder.area());
    }
}
