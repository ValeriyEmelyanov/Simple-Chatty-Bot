import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int count = 0;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 != 0) {
                continue;
            }
            count++;
            sum += i;
        }

        System.out.println(sum * 1.0 / count);
    }
}