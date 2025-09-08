import java.util.Random;

public class FootballTeamHeightAnalytics {
    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random random = new Random();
        for (int i = 0; i < 11; i++) {
            heights[i] = random.nextInt(101) + 150;
        }
        return heights;
    }

    public static int sumOfElements(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static double findMean(int[] array) {
        return (double)sumOfElements(array) / array.length;
    }

    public static int findShortest(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) min = value;
        }
        return min;
    }

    public static int findTallest(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) max = value;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.println("Heights: " + java.util.Arrays.toString(heights));
        System.out.println("Sum: " + sumOfElements(heights));
        System.out.println("Mean: " + String.format("%.2f", findMean(heights)));
        System.out.println("Shortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
    }
}
