//Challenge 35 : Reverse the digits of a number using Loops
import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse the digits");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse of your number is " + reverse);

        input.close();
    }

    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
