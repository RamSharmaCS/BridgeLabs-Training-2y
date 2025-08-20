import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double op1 = a + b * c;
        double op2 = a * b + c;
        double op3 = c + a / b;
        double op4 = a % b + c;
        System.out.println("a + b*c = " + op1);
        System.out.println("a*b + c = " + op2);
        System.out.println("c + a/b = " + op3);
        System.out.println("a % b + c = " + op4);
    }
}
