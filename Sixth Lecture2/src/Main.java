import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                System.out.println("Not prime");
                return;

            }
                System.out.println("Prime");

        }

    }
}