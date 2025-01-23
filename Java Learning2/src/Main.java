import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        compareNumbers(num1,num2);
    }
    public static void compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1+" is greater than "+num2+".");

        }
        else if (num1 < num2) {
            System.out.println(num1+" is less than "+num2+".");
        }
        else {
            System.out.println(num1+" is equal to "+num2+".");

        }

    }
}