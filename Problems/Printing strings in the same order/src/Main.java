import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] words = new String[4];

        for (int i = 0; i < 4; i++) {
            words[i] = in.next();
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(words[i]);
        }
    }
}