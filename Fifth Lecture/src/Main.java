import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int number=scanner.nextInt();
        long factorial=1;
        for(int i=1;i<=number;i++){
            factorial*=i;

        }
        System.out.println("factorial of "+number+" is "+factorial);

    }
}