package Handson;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsFinder {
    public static List<Integer> findPrimeFactors(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        // Find and divide by 2 until the number is odd
        while (number % 2 == 0) {
            primeFactors.add(2);
            number /= 2;
        }

        // Find and divide by odd prime factors
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }

        // If the remaining number is greater than 2, it must be a prime factor
        if (number > 2) {
            primeFactors.add(number);
        }

        return primeFactors;
    }

    public static void main(String[] args) {
        int number = 84;
        List<Integer> primeFactors = findPrimeFactors(number);

        System.out.println("Prime factors of " + number + ": " + primeFactors);
    }
}

