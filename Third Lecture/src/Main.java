import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2==0)
        {
            System.out.println("Entered number is Even");
        }
        else
        {
            System.out.println("Enterded number is Odd");


        }

    }
}