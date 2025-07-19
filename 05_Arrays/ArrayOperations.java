//Challenge 40 - 46 : Array Operations
import java.util.*;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = inputArray(sc);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Find Sum and Average");
            System.out.println("2. Count Occurrence of an Element");
            System.out.println("3. Find Max and Min");
            System.out.println("4. Check if Array is Sorted");
            System.out.println("5. Delete an Element");
            System.out.println("6. Reverse the Array");
            System.out.println("7. Check if Array is Palindrome");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int sum = 0;
                    for (int num : arr) sum += num;
                    double avg = (double) sum / arr.length;
                    System.out.println("Sum: " + sum + ", Average: " + avg);
                    break;

                case 2:
                    System.out.print("Enter element to count: ");
                    int ele = sc.nextInt();
                    int count = 0;
                    for (int num : arr) if (num == ele) count++;
                    System.out.println("Occurrences of " + ele + ": " + count);
                    break;

                case 3:
                    int max = arr[0], min = arr[0];
                    for (int num : arr) {
                        if (num > max) max = num;
                        if (num < min) min = num;
                    }
                    System.out.println("Max: " + max + ", Min: " + min);
                    break;

                case 4:
                    boolean sorted = true;
                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] < arr[i - 1]) {
                            sorted = false;
                            break;
                        }
                    }
                    System.out.println("Array is " + (sorted ? "sorted." : "not sorted."));
                    break;

                case 5:
                    System.out.print("Enter element to delete: ");
                    int del = sc.nextInt();
                    arr = deleteElement(arr, del);
                    System.out.println("Array after deletion: " + Arrays.toString(arr));
                    break;

                case 6:
                    int[] reversed = reverseArray(arr);
                    System.out.println("Reversed Array: " + Arrays.toString(reversed));
                    break;

                case 7:
                    boolean isPalindrome = true;
                    for (int i = 0; i < arr.length / 2; i++) {
                        if (arr[i] != arr[arr.length - 1 - i]) {
                            isPalindrome = false;
                            break;
                        }
                    }
                    System.out.println("Array is " + (isPalindrome ? "a palindrome." : "not a palindrome."));
                    break;

                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static int[] inputArray(Scanner sc) {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        return arr;
    }

    static int[] deleteElement(int[] arr, int ele) {
        return Arrays.stream(arr).filter(e -> e != ele).toArray();
    }

    static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }
}

