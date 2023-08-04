package Handson;

import java.util.Arrays;
import java.util.Scanner;

public class LettersInAscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        char[] letters = name.toCharArray();
        Arrays.sort(letters);

        String result = new String(letters);
        System.out.println("Letters in ascending order: " + result);

        scanner.close();
    }
}

