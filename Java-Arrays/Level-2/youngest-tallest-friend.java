import java.util.Scanner;
public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            while (ages[i] <= 0) {
                System.out.print("Invalid age. Enter again: ");
                ages[i] = input.nextInt();
            }
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = input.nextDouble();
            while (heights[i] <= 0) {
                System.out.print("Invalid height. Enter again: ");
                heights[i] = input.nextDouble();
            }
        }
        int youngestIndex = 0;
        double tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("Youngest friend: " + names[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex]);
        input.close();
    }
}
