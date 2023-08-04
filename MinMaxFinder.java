package Handson;
import java.util.Arrays;

public class MinMaxFinder {
    public static void main(String[] args) {
        // Random array of numbers
        int[] numbers = {45, 12, 67, 23, 89, 34, 56, 9, 78, 91};

        int smallest = findSmallestNumber(numbers);
        int largest = findLargestNumber(numbers);

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }

    public static int findSmallestNumber(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static int findLargestNumber(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
