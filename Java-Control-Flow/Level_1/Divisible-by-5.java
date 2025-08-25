public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        if (A % 5 == 0) {
            System.out.println("divisible by 5");
        }else {
            System.out.println("not divisible by 5");
        }
    }
}
