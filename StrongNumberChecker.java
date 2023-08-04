package Handson;

public class StrongNumberChecker {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int number = 145;

        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }
    }
}

