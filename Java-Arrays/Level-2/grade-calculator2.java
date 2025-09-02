import java.util.Scanner;
public class StudentGrade2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int count = input.nextInt();
        double[][] marks = new double[count][3];
        double[] percentage = new double[count];
        char[] grade = new char[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter physics marks for student " + (i + 1) + ": ");
            marks[i][0] = input.nextDouble();
            while (marks[i][0] < 0) {
                System.out.print("Invalid marks. Enter again: ");
                marks[i][0] = input.nextDouble();
            }
            System.out.print("Enter chemistry marks for student " + (i + 1) + ": ");
            marks[i][1] = input.nextDouble();
            while (marks[i][1] < 0) {
                System.out.print("Invalid marks. Enter again: ");
                marks[i][1] = input.nextDouble();
            }
            System.out.print("Enter maths marks for student " + (i + 1) + ": ");
            marks[i][2] = input.nextDouble();
            while (marks[i][2] < 0) {
                System.out.print("Invalid marks. Enter again: ");
                marks[i][2] = input.nextDouble();
            }
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
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
            System.out.println("Student " + (i + 1) + ": Physics=" + marks[i][0] + ", Chemistry=" + marks[i][1] + ", Maths=" + marks[i][2] + ", Percentage=" + percentage[i] + ", Grade=" + grade[i]);
        }
        input.close();
    }
}
