package Handson;

public class PerfectNumberChecker {
    public static boolean isPerfectNumber(int number) {
        int sumOfDivisors = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == number;
    }

    public static void main(String[] args) {
        int number = 28;

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect number.");
        } else {
            System.out.println(number + " is not a Perfect number.");
        }
    }
}

