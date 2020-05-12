import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int number = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            number = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

        String result = "NO";
        if (number > 0) {
            result = "YES";
        }

        System.out.println(result);
    }
}