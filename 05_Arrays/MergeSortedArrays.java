//Challenge 47 : Merging Sorted Arrays
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input second array
        System.out.print("Enter size of second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Merge arrays
        int[] merged = mergeSortedArrays(arr1, arr2);

        // Display result
        System.out.println("Merged sorted array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }

    // Merge two sorted arrays
    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }
}





