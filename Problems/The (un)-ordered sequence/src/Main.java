import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int prevNum = scanner.nextInt();
        int num;
        boolean ascOrder = true;
        boolean descOrder = true;
        while ((num = scanner.nextInt()) != 0) {
            if (ascOrder && !(num >= prevNum)) {
                ascOrder = false;
            }
            if (descOrder && !(num <= prevNum)) {
                descOrder = false;
            }
            if (!ascOrder && !descOrder) {
                break;
            }
            prevNum = num;
        }

        System.out.println(ascOrder || descOrder);
    }
}