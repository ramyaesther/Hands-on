package Handson;

public class StringPermutations {
    public static void printPermutations(String str) {
        permuteHelper(str.toCharArray(), 0);
    }

    private static void permuteHelper(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(new String(chars));
        } else {
            for (int i = index; i < chars.length; i++) {
                swap(chars, index, i);
                permuteHelper(chars, index + 1);
                swap(chars, index, i); // Backtrack (undo the swap) for the next iteration
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String input = "abc";
        System.out.println("All permutations of the string " + input + ":");
        printPermutations(input);
    }
}
