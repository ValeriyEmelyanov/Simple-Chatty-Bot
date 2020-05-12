import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (++number % 2 != 0) {
            number++;
        }

        System.out.println(number);
    }
}