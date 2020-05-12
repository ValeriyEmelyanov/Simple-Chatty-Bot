import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split("\\s");

        final String errorMsg = "Unknown operator";
        if (words.length != 3) {
            System.out.println(errorMsg);
            return;
        }

        long firstNumber = Long.valueOf(words[0]);
        long secondNumber = Long.valueOf(words[2]);

        long result = 0;
        switch (words[1]) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Division by 0!");
                    return;
                }
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println(errorMsg);
                return;
        }

        System.out.println(result);
    }
}