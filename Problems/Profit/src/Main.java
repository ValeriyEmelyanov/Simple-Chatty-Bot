import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int money = scanner.nextInt();
        final int percent = scanner.nextInt();
        final int reach = scanner.nextInt();

        int years = 0;
        double moneyAndProfit = money;
        while (moneyAndProfit < reach) {
            moneyAndProfit = moneyAndProfit * (100 + percent) / 100;
            years++;
        }

        System.out.println(years);
    }
}