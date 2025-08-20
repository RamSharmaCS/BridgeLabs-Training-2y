import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceFeet = sc.nextDouble();
        double yards = distanceFeet / 3;
        double miles = distanceFeet / (1760 * 3);
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }
}
