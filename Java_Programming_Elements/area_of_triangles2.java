import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();
        double areaCm = 0.5 * base * height;
        double baseInches = base / 2.54;
        double heightInches = height / 2.54;
        double areaInches = 0.5 * baseInches * heightInches;
        System.out.println("Area of Triangle: " + areaCm + " cm² and " + areaInches + " in²");
        sc.close();
    }
}
