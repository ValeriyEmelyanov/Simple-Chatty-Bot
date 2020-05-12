import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        int result = 0;
        long factorial = 1;

        do {
            result++;
            factorial *= result;
        } while (factorial <= number);

        System.out.println(result);
    }
}