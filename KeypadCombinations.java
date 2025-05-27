// Day 10_1: Keypad Combinations
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeypadCombinations {
    private static final String[] DIGIT_TO_LETTERS = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter digits (2-9): ");
        String digits = scanner.nextLine();
        List<String> combinations = letterCombinations(digits);
        System.out.println("Possible combinations:");
        for (String combo : combinations) {
            System.out.println(combo);
        }
        scanner.close();
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    private static void backtrack(String digits, int index, StringBuilder path, List<String> result) {
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }
        String possibleLetters = DIGIT_TO_LETTERS[digits.charAt(index) - '0'];
        for (char letter : possibleLetters.toCharArray()) {
            path.append(letter);
            backtrack(digits, index + 1, path, result);
            path.deleteCharAt(path.length() - 1);
        }
    }
}