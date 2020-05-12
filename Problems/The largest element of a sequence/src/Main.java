import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE;
        while ((number = scanner.nextInt()) != 0) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println(max);
    }
}