import java.util.Scanner;

public class EuclideanDistanceLineEquation {
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x1, y1: ");
        double x1 = scan.nextDouble(), y1 = scan.nextDouble();
        System.out.print("Enter x2, y2: ");
        double x2 = scan.nextDouble(), y2 = scan.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        double[] line = findLineEquation(x1, y1, x2, y2);

        System.out.printf("Distance: %.2f%n", distance);
        System.out.printf("Line equation: y = %.2fx + %.2f%n", line[0], line[1]);
    }
}
