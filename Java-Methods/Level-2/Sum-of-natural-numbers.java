import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int recursiveSum = sumUsingRecursion(n);
        int formulaSum = n * (n + 1) / 2;
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Results match: " + (recursiveSum == formulaSum));
        input.close();
    }
    public static int sumUsingRecursion(int n) {
        if (n == 1) return 1;
        return n + sumUsingRecursion(n - 1);
    }
}
