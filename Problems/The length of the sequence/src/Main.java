import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int len = -1;

        do {
            len++;
            num = scanner.nextInt();
        } while (num > 0);

        System.out.println(len);
    }
}