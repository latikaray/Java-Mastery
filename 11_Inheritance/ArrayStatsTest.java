//Challenge 82 : Using inheritance with static methods and nested classes
import java.util.Arrays;

class ArrayStats {
    static class Statistics {
        static double mean(int[] arr) {
            int sum = 0;
            for (int num : arr) sum += num;
            return (double) sum / arr.length;
        }

        static double median(int[] arr) {
            Arrays.sort(arr);
            int mid = arr.length / 2;
            return (arr.length % 2 == 0) ? 
                   (arr[mid - 1] + arr[mid]) / 2.0 : 
                   arr[mid];
        }
    }
}

public class ArrayStatsTest {
    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 1, 9};

        System.out.println("Mean: " + ArrayStats.Statistics.mean(nums));
        System.out.println("Median: " + ArrayStats.Statistics.median(nums));
    }
}

