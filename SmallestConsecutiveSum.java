package Handson;
public class SmallestConsecutiveSum {
    public static int findSmallestSum(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum = Math.min(num, currentSum + num);
            minSum = Math.min(minSum, currentSum);
        }

        return minSum;
    }

    public static void main(String[] args) {
        int[] array = {3, -4, 2, -3, -1, 7, -5};
        int smallestSum = findSmallestSum(array);
        System.out.println("Smallest Sum of consecutive numbers: " + smallestSum);
    }
}
