import java.util.Scanner;

class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Koi number daaliye: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int result = 0;
        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, 4);
            number /= 10;
        }
        if (result == originalNumber) {
            System.out.println(originalNumber + " ek Armstrong number hai.");
        } else {
            System.out.println(originalNumber + " Armstrong number nahi hai.");
        }
    }
}
