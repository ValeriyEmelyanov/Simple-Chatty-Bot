import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] seq = new int[length];
        for (int i = 0; i < seq.length; i++) {
            seq[i] = scanner.nextInt();
        }

        int max = 0;
        for (int i : seq) {
            if (i % 4 == 0 && i > max) {
                max = i;
            }
        }

        System.out.println(max);
    }
}