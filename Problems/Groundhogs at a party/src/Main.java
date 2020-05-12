import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        int min = isWeekend ? 15 : 10;
        int max = isWeekend ? 25 : 20;
        System.out.println(cups >= min && cups <= max);
    }
}