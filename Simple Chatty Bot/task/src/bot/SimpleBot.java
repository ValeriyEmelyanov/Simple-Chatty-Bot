package bot;

import java.util.Random;
import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        final int itemCount = 4;
        String[] items = new String[itemCount];
        items[0] = "To repeat a statement multiple times.";
        String correctItem = "To decompose a program into several small subroutines.";
        items[1] = correctItem;
        items[2] = "To determine the execution time of a program.";
        items[3] = "To interrupt the execution of a program.";

        int itemNumber;
        while (true) {
            printTest(items);
            itemNumber = scanner.nextInt();
            if (itemNumber > 0 && itemNumber <= itemCount
                    && items[itemNumber - 1].equals(correctItem)) {
                break;
            }
            System.out.println("Please, try again.");
            mixTest(items);
        }
    }

    private static void printTest(String[] items) {
        System.out.println("Why do we use methods?");
        int counter = 1;
        for (String q : items) {
            System.out.println(String.format("%d. %s", counter++, q));
        }
    }

    private static void mixTest(String[] items) {
        Random random = new Random();
        for (int i = 0; i < items.length; i++) {
            int index = random.nextInt(i + 1);
            String item = items[index];
            items[index] = items[i];
            items[i] = item;
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
