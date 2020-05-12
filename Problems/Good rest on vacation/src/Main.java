import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int duration = scanner.nextInt();
        final int foodCostPerDay = scanner.nextInt();
        final int flightCost = scanner.nextInt();
        final int nightCost = scanner.nextInt();

        int result = foodCostPerDay * duration
                + nightCost * (duration - 1)
                + flightCost * 2;

        System.out.println(result);
    }
}