import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();
        int[] elements = new int[number];
        for (int i = 0; i < number; i++) {
            elements[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i : elements) {
            if (i % 6 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}