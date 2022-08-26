package Assignment2;

import java.util.Scanner;

class Cone {
    public final double height;
    public final double radius;
    public static final double pi = 22.0 / 7;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getSlantHeight(){
        return Math.sqrt(Math.pow(this.height, 2)  + Math.pow(this.radius, 2));
    }
    public double volume() {
        return (pi * Math.pow(this.radius, 2) * this.height)/3;
    }
    public double area() {
        return pi * this.radius * (this.radius + getSlantHeight());
    }
}

class ConeMain {
    public static void main(String[] args) {
        System.out.print("[!] Enter height and radius to create a new cone:\n > ");
        Scanner sc = new Scanner(System.in);
        Cone cone = new Cone(sc.nextDouble(), sc.nextDouble());
        System.out.printf("Volume of the cone: %.2f\n", cone.volume());
        System.out.printf("Area of the cone: %.2f", cone.area());
    }
}
