import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Celsius is " + celsius);
        System.out.println("Fahrenheit is " + fahrenheit);

    }
}