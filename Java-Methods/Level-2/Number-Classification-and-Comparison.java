import java.util.Scanner;

public class NumberClassifier {
    public static boolean isPositive(int number) {
        return number > 0;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        if (number1 < number2) return -1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        for (int number : numbers) {
            if (isPositive(number)) {
                if (isEven(number)) {
                    System.out.println(number + " is positive and even");
                } else {
                    System.out.println(number + " is positive and odd");
                }
            } else if (number < 0) {
                System.out.println(number + " is negative");
            } else {
                System.out.println("Zero");
            }
        }
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("First element is greater than last");
        } else if (result == -1) {
            System.out.println("Last element is greater than first");
        } else {
            System.out.println("First and last elements are equal");
        }
        input.close();
    }
}
