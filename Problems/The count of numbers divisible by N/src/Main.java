import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int start = scanner.nextInt();
        final int end = scanner.nextInt();
        final int num = scanner.nextInt();

        long count = IntStream.rangeClosed(start, end)
                .filter(i -> i % num == 0)
                .count();

        System.out.println(count);
    }
}