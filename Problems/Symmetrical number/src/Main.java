import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int left = number / 100;
        left = left % 10 * 10 + left / 10;
        int right = number % 100;

        System.out.println(left / right + left % right);
    }
}