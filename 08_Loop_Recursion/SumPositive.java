//Challenge 66 : Sum of positive numbers in an array and ignore negative numbers
class SumPositive {
    public static void main(String[] args) {
        System.out.println("Welcome to adding positive numbers.");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray(sc);

        int sum = 0;
        for (int num : numArr) {
            if (num < 0) {
                continue;
            }
            sum += num;
        }
        
        System.out.println("The sum of positive numbers is: " + sum);
    }
}



