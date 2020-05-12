import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String msg;
        switch (input) {
            case "gryffindor":
                msg = "bravery";
                break;
            case "hufflepuff":
                msg = "loyalty";
                break;
            case "slytherin":
                msg = "cunning";
                break;
            case "ravenclaw":
                msg = "intellect";
                break;
            default:
                msg = "not a valid house";
        }

        System.out.println(msg);
    }
}