package Handson;

public class CharacterCounter {
    public static int countCharacterOccurrences(String input, char character) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == character) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "hello world";
        char characterToCount = 'l';
        int occurrences = countCharacterOccurrences(input, characterToCount);
        System.out.println("The character '" + characterToCount + "' appears " + occurrences + " times in the string.");
    }
}

