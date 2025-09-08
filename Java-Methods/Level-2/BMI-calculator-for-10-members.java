import java.util.Scanner;

public class BMICalculator {
    public static double[][] calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100.0;
            data[i][2] = weight / (height * height);
        }
        return data;
    }
    public static String[] determineStatus(double[] bmiValues) {
        String[] status = new String[bmiValues.length];
        for (int i = 0; i < bmiValues.length; i++) {
            if (bmiValues[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmiValues[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmiValues[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] personData = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();
        }
        calculateBMI(personData);
        String[] status = determineStatus(new double[]{personData[0][2], personData[1][2], personData[2][2], personData[3][2], personData[4][2], personData[5][2], personData[6][2], personData[7][2], personData[8][2], personData[9][2]});
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": Weight=" + personData[i][0] + "kg, Height=" + personData[i][1] + "cm, BMI=" + personData[i][2] + ", Status=" + status[i]);
        }
        input.close();
    }
}
