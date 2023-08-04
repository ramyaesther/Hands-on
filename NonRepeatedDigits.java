package Handson;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedDigits {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 9, 7, 5, 3, 2, 7, 6, 8, 1};

        Map<Integer, Integer> digitFrequency = new HashMap<>();

        // Count the frequency of each digit in the array
        for (int num : numbers) {
            digitFrequency.put(num, digitFrequency.getOrDefault(num, 0) + 1);
        }

        // Print the non-repeated digits
        for (int num : numbers) {
            if (digitFrequency.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
    }
}

