import java.util.scanner;
public class NumberCheckerDuckArmstrongLargestSmallest {
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

    public static boolean isDuckNumber(int number) {
        String str = String.valueOf(number);
        return str.contains("0") && !str.startsWith("0");
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, digits.length);
        }
        return sum == number;
    }

    public static int findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) largest = digit;
        }
        return largest;
    }

    public static int findSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return secondLargest;
    }

    public static int findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) smallest = digit;
        }
        return smallest;
    }

    public static int findSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        System.out.println(isDuckNumber(3210));
        System.out.println(isArmstrongNumber(153));
        int[] digits = storeDigits(1234);
        System.out.println("Largest: " + findLargest(digits));
        System.out.println("Second Largest: " + findSecondLargest(digits));
        System.out.println("Smallest: " + findSmallest(digits));
        System.out.println("Second Smallest: " + findSecondSmallest(digits));
    }
}
