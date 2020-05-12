//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] lines = new String[3];

        for (int i = 0; i < 3; i++) {
            lines[i] = in.next();
        }

        for (int i = 2; i >= 0; i--) {
            System.out.println(lines[i]);
        }
    }
}