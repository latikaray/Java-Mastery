//Challenge 64: Finding occurrences of a number in an array using for-each loop
import java.util.Scanner;

// Utility class for array operations
class ArrayUtility {
    public static int[] inputArray(Scanner scanner) {
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}

// Main class with main method
public class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding occurrences");

        int[] nums = ArrayUtility.inputArray(input);

        System.out.print("Now, enter the number you want to search: ");
        int element = input.nextInt();

        int occ = countOccurrences(nums, element);
        System.out.println("Your element was found: " + occ + " times.");

        input.close();
    }

    public static int countOccurrences(int[] nums, int element) {
        int occ = 0;
        for (int num : nums) {
            if (num == element) {
                occ++;
            }
        }
        return occ;
    }
}




