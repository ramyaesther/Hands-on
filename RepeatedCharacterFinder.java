package Handson;
public class RepeatedCharacterFinder {
    public static void printRepeatedCharacters(String input) {
        StringBuilder repeatedCharacters = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (input.indexOf(currentChar, i + 1) != -1 && repeatedCharacters.indexOf(String.valueOf(currentChar)) == -1) {
                repeatedCharacters.append(currentChar);
            }
        }

        System.out.println("Repeated characters in the string: " + repeatedCharacters);
    }

    public static void main(String[] args) {
        String input = "hello world";
        printRepeatedCharacters(input);
    }
}

