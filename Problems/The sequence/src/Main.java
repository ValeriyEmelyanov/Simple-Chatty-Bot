import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int seqLen = scanner.nextInt();
        int[] seq = new int[seqLen];
        int i = 0;
        while (i < seqLen) {
            seq[i++] = scanner.nextInt();
        }

        i = 0;
        int maxDivBy4 = 0;
        while (i < seqLen) {
            if (seq[i] % 4 == 0 && seq[i] > maxDivBy4) {
                maxDivBy4 = seq[i];
            }
            i++;
        }

        System.out.println(maxDivBy4);
    }
}