import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = String.valueOf(scanner.nextInt()).charAt(0);
        System.out.println(firstChar);
    }
}