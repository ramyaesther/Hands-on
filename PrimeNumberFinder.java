package Handson;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static List<Integer> findPrimesInRange(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) primes.add(i);
        }
        return primes;
    }

    public static void main(String[] args) {
        int start = 10, end = 50;
        List<Integer> primesInRange = findPrimesInRange(start, end);
        System.out.println("Prime numbers between " + start + " and " + end + ": " + primesInRange);
    }
}

