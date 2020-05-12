import java.util.Scanner;

public class Main {
    private static final char[] VOWELS = "AEIOUaeiou".toCharArray();

    public static boolean isVowel(char ch) {
        for (char vowel : VOWELS) {
            if (vowel == ch) {
                return true;
            }
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}