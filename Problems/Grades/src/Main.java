import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();
        int[] grades = new int[number];
        for (int i = 0; i < number; i++) {
            grades[i] = scanner.nextInt();
        }

        int gradeD = 0;
        int gradeC = 0;
        int gradeB = 0;
        int gradeA = 0;
        for (int i : grades) {
            if (i == 2) {
                gradeD++;
            } else if (i == 3) {
                gradeC++;
            } else if (i == 4) {
                gradeB++;
            } else if (i == 5) {
                gradeA++;
            }
        }

        System.out.printf("%d %d %d %d", gradeD, gradeC, gradeB, gradeA);
    }
}