import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println(str.substring(first, second + 1));
    }
}