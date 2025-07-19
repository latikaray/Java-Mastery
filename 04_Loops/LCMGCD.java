//Challenge 32,33 : Calculate GCD and LCM using Loops

public class LCMGCD {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;

        int gcd = 1;
        int min = Math.min(num1, num2);

        // Loop to find GCD
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        // Loop to find LCM
        int lcm = 0;
        for (int i = Math.max(num1, num2); ; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }
        }

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
