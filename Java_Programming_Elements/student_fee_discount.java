import java.util.Scanner;
public class StudentFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student fee (INR): ");
        double fee = sc.nextDouble();
        System.out.print("Enter discount percent: ");
        double discountPercent = sc.nextDouble();
        double discountAmount = (fee * discountPercent) / 100;
        double finalFee = fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount);
        System.out.println("Final discounted fee is INR " + finalFee);
        sc.close();
    }
} 
