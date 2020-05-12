import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();

        int reversed = 0;
        int remains = number;
        while (remains != 0) {
            reversed = reversed * 10 + remains % 10;
            remains /= 10;
        }

        System.out.println(Integer.valueOf(reversed));
    }
}