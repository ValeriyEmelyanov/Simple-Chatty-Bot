import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] parts = new int[number];
        for (int i = 0; i < number; i++) {
            parts[i] = scanner.nextInt();
        }

        int ship = 0;
        int fix = 0;
        int reject = 0;
        for (int i : parts) {
            if (i == 0) {
                ship++;
            } else if (i > 0) {
                fix++;
            } else {
                reject++;
            }
        }

        System.out.printf("%d %d %d", ship, fix, reject);
    }
}