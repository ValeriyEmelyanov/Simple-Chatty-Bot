import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            numbers[i]--;
        }

        System.out.printf("%d %d %d %d",
                numbers[0],
                numbers[1],
                numbers[2],
                numbers[3]);
    }
}