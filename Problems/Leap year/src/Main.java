import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        String msg = "Regular";
        if (year % 4 == 0 && year % 100 != 0
                || year % 400 == 0) {
            msg = "Leap";
        }

        System.out.println(msg);
    }
}