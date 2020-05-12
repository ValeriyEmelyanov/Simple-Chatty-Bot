import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsCount = 3;
        int[] numOfStudents = new int[groupsCount];

        for (int i = 0; i < groupsCount; i++) {
            numOfStudents[i] = scanner.nextInt();
        }

        int numOfDesks = 0;
        int numOfStudentsPerDesk = 2;
        for (int i = 0; i < groupsCount; i++) {
            numOfDesks += numOfStudents[i] / numOfStudentsPerDesk + numOfStudents[i] % numOfStudentsPerDesk;
        }

        System.out.println(numOfDesks);
    }
}