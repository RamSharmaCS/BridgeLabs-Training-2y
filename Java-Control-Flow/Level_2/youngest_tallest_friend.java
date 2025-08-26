import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();

        System.out.print("Enter height of Amar: ");
        int heightAmar = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int heightAkbar = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int heightAnthony = sc.nextInt();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngest = "";
        if (youngestAge == ageAmar) youngest = "Amar";
        else if (youngestAge == ageAkbar) youngest = "Akbar";
        else youngest = "Anthony";

        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallest = "";
        if (tallestHeight == heightAmar) tallest = "Amar";
        else if (tallestHeight == heightAkbar) tallest = "Akbar";
        else tallest = "Anthony";

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        sc.close();
    }
}
