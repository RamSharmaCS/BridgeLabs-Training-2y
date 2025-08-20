import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceFeet = sc.nextDouble();
        double distanceYards = distanceFeet / 3;
        double distanceMiles = distanceYards / 1760;
        System.out.println("Distance in feet: " + distanceFeet 
                           + " = " + distanceYards + " yards and " 
                           + distanceMiles + " miles");
        sc.close();
    }
}
