import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int height = scanner.nextInt();
        final int forward = scanner.nextInt();
        final int backward = scanner.nextInt();

        int path = forward;
        int days = 1;

        while (path < height) {
            days++;
            path = path - backward + forward;
        }

        System.out.println(days);
    }
}