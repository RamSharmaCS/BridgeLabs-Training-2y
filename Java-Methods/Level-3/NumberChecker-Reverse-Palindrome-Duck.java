import java.util.scanner;
public class NumberCheckerReversePalindromeDuck {
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

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    public static boolean isDuckNumber(int number) {
        String str = String.valueOf(number);
        return str.contains("0") && !str.startsWith("0");
    }

    public static void main(String[] args) {
        int[] digits = storeDigits(123);
        int[] reversed = reverseDigits(digits);
        System.out.println(compareArrays(digits, reversed));
        System.out.println(isPalindrome(121));
        System.out.println(isDuckNumber(3210));
    }
}
