package Handson;
public class CharacterRemover {
    public static String removeChars(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        for (char c : str1.toCharArray()) {
            if (str2.indexOf(c) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "ol";
        String result = removeChars(str1, str2);
        System.out.println("Resulting string: " + result);
    }
}

