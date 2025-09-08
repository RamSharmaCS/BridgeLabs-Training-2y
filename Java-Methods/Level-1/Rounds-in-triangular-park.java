import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1 of triangle: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side 2 of triangle: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side 3 of triangle: ");
        double side3 = input.nextDouble();
        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;
        int roundsNeeded = (int) Math.ceil(rounds);
        System.out.println("Number of rounds needed to complete 5km run: " + roundsNeeded);
        input.close();
    }
}
