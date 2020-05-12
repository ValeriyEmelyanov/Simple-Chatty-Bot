import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int guestsCount = 8;
        String[] guests = new String[guestsCount];

        for (int i = 0; i < guestsCount; i++) {
            guests[i] = in.next();
        }

        for (int i = guestsCount - 1; i >= 0; i--) {
            System.out.println(guests[i]);
        }
    }
}