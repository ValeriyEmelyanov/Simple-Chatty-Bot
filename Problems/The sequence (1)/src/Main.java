import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();

        int figure = 1;
        int counter = 0;
        while (counter < number) {
            for (int i = 0; i < figure && counter < number; i++) {
                System.out.print(figure + " ");
                counter++;
            }
            figure++;
        }
    }
}