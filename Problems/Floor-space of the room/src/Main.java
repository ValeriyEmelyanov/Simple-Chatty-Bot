import java.util.Scanner;

class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String shape = SCANNER.nextLine();

        double result = 0;
        switch (shape) {
            case "triangle":
                result = callcTriangle();
                break;
            case "rectangle":
                result = callcRectangle();
                break;
            case "circle":
                result = callcCircle();
                break;
            default:
                return;
        }

        System.out.println(result);
    }

    private static double callcTriangle() {
        double a = SCANNER.nextDouble();
        double b = SCANNER.nextDouble();
        double c = SCANNER.nextDouble();
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private static double callcCircle() {
        double r = SCANNER.nextDouble();
        return 3.14 * r * r;
    }

    private static double callcRectangle() {
        double a = SCANNER.nextDouble();
        double b = SCANNER.nextDouble();
        return a * b;
    }
}