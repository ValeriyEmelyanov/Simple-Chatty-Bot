import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

//        String[] items = {"Java", "Kotlin", "Scala", "Python"};
//        System.out.println("what programming language are you learning here?");
//        for (int i = 1; i <= items.length; i++) {
//            System.out.println(String.format("%d. %s", i, items[i - 1]));
//        }

        int answer = scanner.nextInt();

        String msg;
        switch (answer) {
            case 1:
                msg = "Yes!";
                break;
            case 2:
            case 3:
            case 4:
                msg = "No!";
                break;
            default:
                msg = "Unknown number";
        }

        System.out.println(msg);
    }
}