//Challenge 72 : Create a Circle class with radius, circumference, and area
// properties. The class should have a constructor that takes the radius in millimeters as an argument.
import java.util.Scanner;

class Circle {
    double radiusInMm;

    Circle(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }

    double getCircumference() {
        return 2 * radiusInMm * Math.PI;
    }

    double getArea() {
        return Math.PI * Math.pow(radiusInMm, 2);
    }

    @Override
    public String toString() {
        return "Circle Props: Radius in mm: " + radiusInMm
                + " , Circumference in mm: " + getCircumference()
                + ", Area in mm2: " + getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of Circle\n");
        System.out.print("Please enter your radius: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);
        input.close();
    }
}









