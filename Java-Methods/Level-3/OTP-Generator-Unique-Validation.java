import java.util.Random;

public class OTPGeneratorUniqueValidation {
    public static int generateOTP() {
        Random random = new Random();
        return random.nextInt(900000) + 100000;
    }

    public static boolean areAllUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + java.util.Arrays.toString(otps));
        System.out.println("Are all unique? " + areAllUnique(otps));
    }
}
