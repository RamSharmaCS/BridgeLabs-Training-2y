import java.util.Scanner;
public class MultiDimensionalBMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int count = input.nextInt();
        double[][] personData = new double[count][3];
        String[] weightStatus = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter weight for person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();
            while (personData[i][0] <= 0) {
                System.out.print("Invalid weight. Enter again: ");
                personData[i][0] = input.nextDouble();
            }
            System.out.print("Enter height for person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.print("Invalid height. Enter again: ");
                personData[i][1] = input.nextDouble();
            }
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
