import java.util.Scanner;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        int tempNumber = Math.abs(number);
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            digits[index++] = digit;
            tempNumber /= 10;
            if (index == maxDigit) {
                int[] tempDigits = new int[maxDigit * 2];
                System.arraycopy(digits, 0, tempDigits, 0, maxDigit);
                digits = tempDigits;
                maxDigit *= 2;
            }
        }
        int[] reversed = new int[index];
        for (int i = 0; i < index; i++) {
            reversed[i] = digits[index - 1 - i];
        }
        System.out.print("Reversed digits: ");
        for (int digit : reversed) {
            System.out.print(digit + " ");
        }
        input.close();
    }
}
