import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final String fizz = "Fizz";
        final String buzz = "Buzz";

        Scanner scanner = new Scanner(System.in);
        final int start = scanner.nextInt();
        final int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(fizz + buzz);
            } else if (i % 3 == 0) {
                System.out.println(fizz);
            } else if (i % 5 == 0) {
                System.out.println(buzz);
            } else {
                System.out.println(i);
            }
        }
    }
}