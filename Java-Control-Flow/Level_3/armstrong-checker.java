import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // While loop to check Armstrong
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // last digit
            sum += digit * digit * digit;    // cube and add to sum
            originalNumber = originalNumber / 10; // remove last digit
        }

        // Compare sum with original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
