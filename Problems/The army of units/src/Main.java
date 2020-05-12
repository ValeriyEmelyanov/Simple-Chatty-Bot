import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unitsCount = scanner.nextInt();

        String result = "";
        if (unitsCount < 1) {
            result = "no army";
        } else if (unitsCount < 20) {
            result = "pack";
        } else if (unitsCount < 250) {
            result = "throng";
        } else if (unitsCount < 1000) {
            result = "zounds";
        } else {
            result = "legion";
        }

        System.out.println(result);
    }
}