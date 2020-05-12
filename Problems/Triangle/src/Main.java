import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int sideA = 0;
        int sideB = 0;
        int sideC = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            sideA = scanner.nextInt();
            sideB = scanner.nextInt();
            sideC = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        String result = "NO";

        if (sideA + sideB > sideC
                && sideA + sideC > sideB
                && sideB + sideC > sideA) {
            result = "YES";
        }

        System.out.println(result);
    }
}