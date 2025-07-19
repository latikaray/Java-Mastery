//Challenge 88 : Exception Handling using try-catch-finally
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the filename: ");
        String filename = inputScanner.nextLine();

        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            System.out.println("\nFile content:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the filename and try again.");
        } finally {
            inputScanner.close();
        }
    }
}
