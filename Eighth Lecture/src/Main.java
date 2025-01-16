import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class PatternMatching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(" ");
            }
            for (int k = 0; k < n; k++) {
                System.out.println("+");

            }
            System.out.println(" ");


        }

    }
}