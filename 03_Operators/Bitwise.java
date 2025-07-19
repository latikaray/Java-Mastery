//Challenge 21 - 24 :  Use of Bitwise Operators
import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, choice;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        do {
            System.out.println("\nChoose Bitwise Operation:");
            System.out.println("1. AND (&)");
            System.out.println("2. OR (|)");
            System.out.println("3. XOR (^)");
            System.out.println("4. Complement of First Number (~num1)");
            System.out.println("5. Complement of Second Number (~num2)");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Result: " + (num1 & num2));
                case 2 -> System.out.println("Result: " + (num1 | num2));
                case 3 -> System.out.println("Result: " + (num1 ^ num2));
                case 4 -> System.out.println("~" + num1 + " = " + (~num1));
                case 5 -> System.out.println("~" + num2 + " = " + (~num2));
                case 6 -> System.out.println("Exiting program.");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}

