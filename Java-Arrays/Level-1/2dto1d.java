import java.util.Scanner;
public class TwoDToOneDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        int[] flatArray = new int[rows * columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                flatArray[index++] = matrix[i][j];
            }
        }
        System.out.println("Flattened array: ");
        for (int value : flatArray) {
            System.out.print(value + " ");
        }
        input.close();
    }
}
