import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void generateException() {
        String[] names = {"Alice", "Bob"};
        names[5];
    }

    public static void demonstrateException() {
        String[] names = {"Alice", "Bob"};
        try {
            names[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        generateException();
        demonstrateException();
    }
}
