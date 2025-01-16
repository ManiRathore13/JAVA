import java.util.Scanner;
class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kilograms (0 < W < 500): ");
        double weight = scanner.nextDouble();
        if (weight <= 0 || weight >= 500) {
            System.out.println("Invalid weight. Please enter a value between 0 and 500.");
            return;
        }

        System.out.print("Enter height in meters (0 < H < 3.0): ");
        double height = scanner.nextDouble();
        if (height <= 0 || height >= 3.0) {
            System.out.println("Invalid height. Please enter a value between 0 and 3.0.");
            return;
        }
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Category: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");65
        }
    }
}
