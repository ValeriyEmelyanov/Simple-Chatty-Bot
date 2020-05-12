import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int directionNumber = scanner.nextInt();

        String msg;
        switch (directionNumber) {
            case 0:
                msg = "do not move";
                break;
            case 1:
                msg = "move up";
                break;
            case 2:
                msg = "move down";
                break;
            case 3:
                msg = "move left";
                break;
            case 4:
                msg = "move right";
                break;
            default:
                msg = "error!";
        }

        System.out.println(msg);
    }
}