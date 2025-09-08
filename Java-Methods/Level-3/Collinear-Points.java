import java.util.Scanner;

public class CollinearPointsUsingSlopeAndArea {
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return Math.abs(slopeAB - slopeBC) < 1e-9 && Math.abs(slopeBC - slopeAC) < 1e-9;
    }

    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 1e-9;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x1, y1: ");
        double x1 = scan.nextDouble(), y1 = scan.nextDouble();
        System.out.print("Enter x2, y2: ");
        double x2 = scan.nextDouble(), y2 = scan.nextDouble();
        System.out.print("Enter x3, y3: ");
        double x3 = scan.nextDouble(), y3 = scan.nextDouble();

        System.out.println("Collinear by slope: " + areCollinearBySlope(x1, y1, x2, y2, x3, y3));
        System.out.println("Collinear by area: " + areCollinearByArea(x1, y1, x2, y2, x3, y3));
    }
}
