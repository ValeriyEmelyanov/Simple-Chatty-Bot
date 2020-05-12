import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shapeNumber = scanner.nextInt();

        String msg = "You have chosen a ";
        switch (shapeNumber) {
            case 1:
                msg += "square";
                break;
            case 2:
                msg += "circle";
                break;
            case 3:
                msg += "triangle";
                break;
            case 4:
                msg += "rhombus";
                break;
            default:
                msg = "There is no such shape!";
        }

        System.out.println(msg);
    }
}