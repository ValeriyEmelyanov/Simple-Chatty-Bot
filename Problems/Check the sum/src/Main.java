import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] numbers = new  int[3];

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

        boolean result = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == 20) {
                    result = true;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}