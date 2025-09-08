import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("Maximum number of possible handshakes: " + handshakes);
        input.close();
    }
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
