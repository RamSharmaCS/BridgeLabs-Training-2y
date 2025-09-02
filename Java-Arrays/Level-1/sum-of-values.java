import java.util.Scanner;
public class SumOfValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter a number: ");
            double number = input.nextDouble();
            if (number <= 0 || index >= values.length) {
                break;
            }
            values[index] = number;
            index++;
        }
        for (int i = 0; i < index; i++) {
            total += values[i];
        }
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println("\nSum of all numbers: " + total);
        input.close();
    }
}
