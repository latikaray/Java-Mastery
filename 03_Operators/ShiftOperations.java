//Challenge 25, 26 : Use of Left, Right Shift Operators

import java.util.Scanner;

public class ShiftOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, shift, choice;

        System.out.print("Enter the number: ");
        number = sc.nextInt();
        System.out.print("Enter number of positions to shift: ");
        shift = sc.nextInt();

        do {
            System.out.println("\nChoose Shift Operation:");
            System.out.println("1. Left Shift (<<)");
            System.out.println("2. Right Shift (>>)");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println(number + " << " + shift + " = " + (number << shift));
                case 2 -> System.out.println(number + " >> " + shift + " = " + (number >> shift));
                case 3 -> System.out.println("Exiting program.");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}
