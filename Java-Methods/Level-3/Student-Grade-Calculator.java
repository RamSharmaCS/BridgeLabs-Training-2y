import java.util.Random;

public class StudentGradeCalculator {
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(90) + 10;
            }
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][4];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }

    public static char getGrade(double percentage) {
        if (percentage >= 80) return 'A';
        if (percentage >= 70) return 'B';
        if (percentage >= 60) return 'C';
        if (percentage >= 50) return 'D';
        if (percentage >= 40) return 'E';
        return 'R';
    }

    public static void displayScorecard(int[][] scores, double[][] stats) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                          "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10s %-10d %-10d %-10d %-10.2f %-10.2f %-10c%n",
                              "S" + (i+1),
                              scores[i][0],
                              scores[i][1],
                              scores[i][2],
                              stats[i][0],
                              stats[i][1],
                              getGrade(stats[i][2]));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = scan.nextInt();

        int[][] scores = generateScores(n);
        double[][] stats = calculateStats(scores);
        displayScorecard(scores, stats);
    }
}
