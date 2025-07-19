//Challenge 27 : perform odd/even check using bitwise operators

import java.util.Scanner;

class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd/Even Calculator");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        if ((num & 1) == 1) {
            System.out.println("Your number is odd");
        } else {
            System.out.println("Your number is even");
        }

        input.close();
    }
}


