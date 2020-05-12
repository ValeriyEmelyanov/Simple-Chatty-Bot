import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floor = scanner.nextInt();
        int ceiling = scanner.nextInt();
        int real = scanner.nextInt();

        String msg = "Normal";
        if (real < floor) {
            msg = "Deficiency";
        } else if (real > ceiling) {
            msg = "Excess";
        }

        System.out.println(msg);
    }
}