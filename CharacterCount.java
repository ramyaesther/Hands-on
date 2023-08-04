package Handson;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int count = countCharacterOccurrences(input, 'a');

        System.out.println("The character 'a' appears " + count + " times in the input.");

        scanner.close();
    }

    public static int countCharacterOccurrences(String str, char character) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == character) {
                count++;
            }
        }
        return count;
    }
}

