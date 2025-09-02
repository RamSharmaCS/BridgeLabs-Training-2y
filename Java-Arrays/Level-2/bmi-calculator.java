import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int count = input.nextInt();
        double[] weight = new double[count];
        double[] height = new double[count];
        double[] bmi = new double[count];
        String[] status = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter weight for person " + (i + 1) + ": ");
            weight[i] = input.nextDouble();
            while (weight[i] <= 0) {
                System.out.print("Invalid weight. Enter again: ");
                weight[i] = input.nextDouble();
            }
            System.out.print("Enter height for person " + (i + 1) + ": ");
            height[i] = input.nextDouble();
            while (height[i] <= 0) {
                System.out.print("Invalid height. Enter again: ");
                height[i] = input.nextDouble();
            }
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println("Person " + (i + 1) + ": Height=" + height[i] + ", Weight=" + weight[i] + ", BMI=" + bmi[i] + ", Status=" + status[i]);
        }
        input.close();
    }
}
