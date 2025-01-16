import java.util.Scanner;

    class PlusPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = scanner.nextInt();

        // Loop for each row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print '+' symbols
            for (int k = 1; k <= i; k++) {
                System.out.print("+");
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}
