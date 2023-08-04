package Handson;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacterFinder {
    public static char findUniqueCharacter(String input) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : input.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        for (char c : input.toCharArray()) {
            if (charFrequency.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String input = "abracadabra";
        char uniqueChar = findUniqueCharacter(input);
        System.out.println("The unique character is: " + (uniqueChar != '\0' ? uniqueChar : "None"));
    }
}

