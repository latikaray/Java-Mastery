//Challenge 5
//Inputting a name and printing a welcome message

import java.util.Scanner;

class Welcome {
    public static void main(String[] args) {
        System.out.print("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to KG Coding");

        input.close(); // This finally closes the scanner to prevent resource leaks
    }
}