//Challenge 34,37,38 : Check Prime, Armstrong, Palindrome using Loops

public class NumberCheck {
    public static void main(String[] args) {
        int primeTest = 29;
        int armstrongTest = 153;
        int palindromeTest = 121;

        // Check prime
        boolean isPrime = true;
        if (primeTest <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= primeTest / 2; i++) {
                if (primeTest % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(primeTest + " is prime? " + isPrime);

        // Check Armstrong
        int temp = armstrongTest, sum = 0, digits = 0;
        int copy = temp;
        while (copy > 0) {
            digits++;
            copy /= 10;
        }
        copy = temp;
        while (copy > 0) {
            int digit = copy % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
            copy /= 10;
        }
        boolean isArmstrong = (sum == armstrongTest);
        System.out.println(armstrongTest + " is Armstrong? " + isArmstrong);

        // Check Palindrome
        int original = palindromeTest, reversed = 0;
        while (palindromeTest > 0) {
            int digit = palindromeTest % 10;
            reversed = reversed * 10 + digit;
            palindromeTest /= 10;
        }
        boolean isPalindrome = (original == reversed);
        System.out.println(original + " is palindrome? " + isPalindrome);
    }
}
