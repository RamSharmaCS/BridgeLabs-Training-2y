import java.util.Random;

public class EmployeeBonusCalculator {
    public static double calculateBonus(double salary, int yearsOfService) {
        if (yearsOfService > 5) return salary * 0.05;
        return salary * 0.02;
    }

    public static void main(String[] args) {
        Random random = new Random();
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = random.nextInt(90000) + 10000;
            data[i][1] = random.nextInt(30) + 1;
        }

        double totalBonus = 0;
        for (int i = 0; i < 10; i++) {
            double bonus = calculateBonus(data[i][0], (int)data[i][1]);
            totalBonus += bonus;
            System.out.printf("Employee %d: Salary %.2f, Years %d, Bonus %.2f%n", 
                              i+1, data[i][0], (int)data[i][1], bonus);
        }

        System.out.printf("Total Bonus: %.2f%n", totalBonus);
    }
}
