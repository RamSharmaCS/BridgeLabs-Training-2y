import java.util.Scanner;
public class FactorFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    int[] temp = new int[maxFactor * 2];
                    System.arraycopy(factors, 0, temp, 0, maxFactor);
                    factors = temp;
                    maxFactor *= 2;
                }
                factors[index++] = i;
            }
        }
        System.out.println("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        input.close();
    }
}
