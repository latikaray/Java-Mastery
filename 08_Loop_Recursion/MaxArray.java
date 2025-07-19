//Challenge 63 : Finding the maximum number in an array using loops
class MaxArray {
    public static void main(String[] args) {
        System.out.println("Welcome to finding the maximum\n");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int max = Integer.MIN_VALUE;
        for (int num: arr) {
            if (max < num) {
                max = num;
            }
        }

        System.out.println("Maximum number is: " + max);
    }
}
