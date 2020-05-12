import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        final int limit = 1000;
        while ((number = scanner.nextInt()) != 0) {
            sum += number;
            if (sum >= limit) {
                sum -= limit;
                break;
            }
        }

        System.out.println(sum);
    }
}