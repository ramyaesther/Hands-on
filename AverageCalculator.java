package Handson;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numberOfIntegers = 10;

        for (int i = 1; i <= numberOfIntegers; i++) {
            System.out.print("Enter integer " + i + ": ");
            int num = scanner.nextInt();
            sum += num;
        }

        double average = (double) sum / numberOfIntegers;
        System.out.println("Average value: " + average);

        scanner.close();
    }
}

