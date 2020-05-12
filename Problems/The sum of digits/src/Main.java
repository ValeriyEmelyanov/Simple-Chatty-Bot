import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] chars = scanner.nextLine().toCharArray();

        final int zeroCode = 48;
        int sum = 0;

        for (char c : chars) {
            if (c >= zeroCode && c <= zeroCode + 10) {
                sum += c - zeroCode;
            }
        }

        System.out.println(sum);
    }
}