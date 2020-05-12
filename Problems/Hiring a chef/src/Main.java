import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final String temlate =
                "The form for %s is completed. We will contact you if we need a chef that cooks %s dishes.";

        Scanner in = new Scanner(System.in);

        String firstName = in.next();
        in.next();
        in.next();
        in.next();
        String cuisinePpreference = in.next();

        System.out.println(String.format(temlate,
                firstName,
                cuisinePpreference));
    }
}