import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[6];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = nums[3] * 3600 + nums[4] * 60 + nums[5]
                - (nums[0] * 3600 + nums[1] * 60 + nums[2]);

        System.out.println(result);
    }
}