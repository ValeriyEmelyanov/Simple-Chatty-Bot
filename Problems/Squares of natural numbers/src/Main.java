import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int limit = scanner.nextInt();
        int number = 1;
        int square;

        while ((square = number * number++) <= limit) {
            System.out.println(square);
        }
    }
}