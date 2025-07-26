//Challenge 101 : Create a thread that prints its name and a number, sleeps for 5 seconds, and then prints its name and the number again.
package Multithreading17.challenge101;

public class PrintThread extends Thread {
    private final int threadNumber;

    public PrintThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.printf("%s Thread Starting-%d\n",
                Thread.currentThread().getName(),
                threadNumber);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%s Thread Ended-%d\n",
                Thread.currentThread().getName(),
                threadNumber);
    }
}