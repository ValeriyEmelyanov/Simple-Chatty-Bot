import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int busHeight = scanner.nextInt();
        final int bridNum = scanner.nextInt();
        int[] bridHeights = new int[bridNum];
        for (int i = 0; i < bridNum; i++) {
            bridHeights[i] = scanner.nextInt();
        }

        String msg = "Will not crash";
        for (int i = 0; i < bridNum; i++) {
            if (busHeight >= bridHeights[i]) {
                msg = String.format("Will crash on bridge %d", i + 1);
                break;
            }
        }

        System.out.println(msg);
    }
}