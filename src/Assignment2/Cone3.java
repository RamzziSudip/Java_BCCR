package Assignment2;

import java.util.Scanner;

class Cone {
    private final double height;
    private final double radius;

    public Cone() {
        System.out.print("[!] Enter height and radius to create a new cone:\n > ");
        Scanner sc = new Scanner(System.in);
        this.height = sc.nextDouble();
        this.radius = sc.nextDouble();
    }

    public double getSlantHeight() {
        return Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.radius, 2));
    }

    public double volume() {
        return (Math.PI * Math.pow(this.radius, 2) * this.height) / 3;
    }

    public double area() {
        return Math.PI * this.radius * (this.radius + getSlantHeight());
    }
}

class ConeMain {
    public static void main(String[] args) {
        Cone cone = new Cone();
        System.out.printf("Volume of the cone: %.2f\n", cone.volume());
        System.out.printf("Area of the cone: %.2f", cone.area());
    }
}
