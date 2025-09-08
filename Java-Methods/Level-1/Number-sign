import java.util.Scanner;

public class NumberSignChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sign = checkSign(number);
        if (sign == 1) {
            System.out.println("Positive");
        } else if (sign == -1) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        input.close();
    }
    public static int checkSign(int number) {
        if (number > 0) return 1;
        if (number < 0) return -1;
        return 0;
    }
}
