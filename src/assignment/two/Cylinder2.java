package assignment.two;

import java.util.Scanner;

class Cylinder {
    private final double height;
    private final double radius;

    public Cylinder() {
        System.out.print("[!] Enter height and radius to create a new cylinder:\n > ");
        Scanner sc = new Scanner(System.in);
        this.height = sc.nextDouble();
        this.radius = sc.nextDouble();
    }

    public double volume() {
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    }
    public double area() {
        return 2 * Math.PI * this.radius * (this.height + this.radius);
    }
}

class CylinderMain {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.printf("Volume of the cylinder: %.2f\n", cylinder.volume());
        System.out.printf("Area of the cylinder: %.2f", cylinder.area());
    }
}
