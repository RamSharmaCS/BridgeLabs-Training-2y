import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = findSum(n);
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
        input.close();
    }
    public static int findSum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
}
