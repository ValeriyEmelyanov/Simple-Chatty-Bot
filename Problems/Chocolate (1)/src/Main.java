import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int sideN = 0;
        int sideM = 0;
        int segmentsK = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            sideN = scanner.nextInt();
            sideM = scanner.nextInt();
            segmentsK = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        String result = "NO";

        if (breakOffExactly(sideN, sideM, segmentsK)
                || breakOffExactly(sideM, sideN, segmentsK)) {
            result = "YES";
        }

        System.out.println(result);
    }

    private static boolean breakOffExactly(int side1, int side2, int segments) {
        return segments % side1 == 0 && segments / side1 <= side2;
    }
}