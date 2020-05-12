import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        boolean isWithin = value > -15 && value <= 12;
        isWithin = isWithin || value > 14 && value < 17;
        isWithin = isWithin || value >= 19;

        System.out.println(isWithin ? "True" : "False");
    }
}