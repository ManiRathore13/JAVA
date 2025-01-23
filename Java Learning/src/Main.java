import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:-");
        double num = scanner.nextDouble();
        double square = calculateSquare(num);
        System.out.println("The square is " + square);
        scanner.close();
    }
        public static double calculateSquare(double num) {
            return num * num;


    }
}