//Challenge 59 : Password checker using do-while loop
//Valid is more than 6 characters

import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Set your password\n");
        String password;
        do {
            System.out.print("Please enter your password: ");
            password = input.next();
        } while (!isValidPassword(password));
        System.out.println("Thanks for entering a valid password");
        input.close();
    }

    public static boolean isValidPassword(String password) {
        return password.length() > 6;
    }
}