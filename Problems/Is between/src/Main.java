import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int number = 0;
        int bound1 = 0;
        int bound2 = 0;

        try {
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            bound1 = scanner.nextInt();
            bound2 = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

        System.out.println(
                number >= bound1 && number <= bound2
                        || number >= bound2 && number <= bound1);
    }
}