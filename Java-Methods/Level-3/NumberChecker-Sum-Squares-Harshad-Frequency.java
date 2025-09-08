import java.util.scanner;
public class NumberCheckerSumSquaresHarshadFrequency {
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        return number % sumOfDigits(number) == 0;
    }

    public static int[][] frequencyOfDigits(int number) {
        int[] digits = storeDigits(number);
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }

        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
        System.out.println(sumOfSquaresOfDigits(123));
        System.out.println(isHarshadNumber(21));
        int[][] freq = frequencyOfDigits(11223);
        for (int[] pair : freq) {
            System.out.println(pair[0] + " -> " + pair[1]);
        }
    }
}
