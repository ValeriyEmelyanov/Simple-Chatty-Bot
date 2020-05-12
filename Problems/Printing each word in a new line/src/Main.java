import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 5;
        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            words[i] = in.next();
        }

        for (int i = 0; i < count; i++) {
            System.out.println(words[i]);
        }
    }
}