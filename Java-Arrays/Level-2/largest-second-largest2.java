import java.util.Scanner;
public class LargestSecondLargestDynamic {
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
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        input.close();
    }
}
