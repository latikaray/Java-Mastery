//Challenge 48 - 50 : Operations on 2D Array
import java.util.Scanner;

public class ArrayOperation2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = null;
        int rows = 0, cols = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input 2D array");
            System.out.println("2. Search an element");
            System.out.println("3. Sum and Average of elements");
            System.out.println("4. Sum of diagonal elements");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter number of rows: ");
                    rows = sc.nextInt();
                    System.out.print("Enter number of columns: ");
                    cols = sc.nextInt();
                    arr = new int[rows][cols];
                    System.out.println("Enter array elements:");
                    for (int i = 0; i < rows; i++)
                        for (int j = 0; j < cols; j++)
                            arr[i][j] = sc.nextInt();
                }

                case 2 -> {
                    if (arr == null) {
                        System.out.println("Array not initialized.");
                        break;
                    }
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < rows; i++)
                        for (int j = 0; j < cols; j++)
                            if (arr[i][j] == key) {
                                System.out.println("Found at (" + i + ", " + j + ")");
                                found = true;
                            }
                    if (!found)
                        System.out.println("Element not found.");
                }

                case 3 -> {
                    if (arr == null) {
                        System.out.println("Array not initialized.");
                        break;
                    }
                    int sum = 0, count = 0;
                    for (int[] row : arr)
                        for (int val : row) {
                            sum += val;
                            count++;
                        }
                    System.out.println("Sum = " + sum);
                    System.out.println("Average = " + (double) sum / count);
                }

                case 4 -> {
                    if (arr == null || rows != cols) {
                        System.out.println("Array not initialized or not square.");
                        break;
                    }
                    int diagSum = 0;
                    for (int i = 0; i < rows; i++)
                        diagSum += arr[i][i] + arr[i][rows - 1 - i];
                    if (rows % 2 == 1)
                        diagSum -= arr[rows / 2][rows / 2]; // Remove double count
                    System.out.println("Sum of diagonals = " + diagSum);
                }

                case 5 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}

