//Challenge 67 : Print even numbers from 1 to 100 using continue statement
class PrintEven {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
