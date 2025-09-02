import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int count = input.nextInt();
        double[] physics = new double[count];
        double[] chemistry = new double[count];
        double[] maths = new double[count];
        double[] percentage = new double[count];
        char[] grade = new char[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter physics marks for student " + (i + 1) + ": ");
            physics[i] = input.nextDouble();
            while (physics[i] < 0) {
                System.out.print("Invalid marks. Enter again: ");
                physics[i] = input.nextDouble();
            }
            System.out.print("Enter chemistry marks for student " + (i + 1) + ": ");
            chemistry[i] = input.nextDouble();
            while (chemistry[i] < 0) {
                System.out.print("Invalid marks. Enter again: ");
                chemistry[i] = input.nextDouble();
            }
            System.out.print("Enter maths marks for student " + (i + 1) + ": ");
            maths[i] = input.nextDouble();
            while (maths[i] < 0) {
                System.out.print("Invalid marks. Enter again: ");
                maths[i] = input.nextDouble();
            }
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println("Student " + (i + 1) + ": Physics=" + physics[i] + ", Chemistry=" + chemistry[i] + ", Maths=" + maths[i] + ", Percentage=" + percentage[i] + ", Grade=" + grade[i]);
        }
        input.close();
    }
}
