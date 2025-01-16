import java.util.Scanner;

    class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal Amount (0 - 100000): ");
        double principal = scanner.nextDouble();
        if (principal < 0 || principal > 100000) {
            System.out.println("Invalid Principal Amount. Please enter a value between 0 and 100000.");
            return;
        }
        System.out.print("Enter Interest Rate (0-100): ");
        double rate = scanner.nextDouble();
        if (rate < 0 || rate > 100) {
            System.out.println("Invalid Interest Rate. Please enter a value between 0 and 100.");
            return;
        }
        System.out.print("Enter Time Period in years (0 - 30): ");
        int time = scanner.nextInt();
        if (time < 0 || time > 30) {
            System.out.println("Invalid Time Period. Please enter a value between 0 and 30.");
            return;
        }
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}