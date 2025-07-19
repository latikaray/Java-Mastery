//Challenge 85 : // Compile time Polymorphism in Java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 ints: " + calc.add(5, 10));
        System.out.println("Sum of 3 ints: " + calc.add(1, 2, 3));
        System.out.println("Sum of 2 doubles: " + calc.add(1.5, 2.5));
    }
}
