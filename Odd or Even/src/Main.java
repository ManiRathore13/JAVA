import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = scanner.nextInt();
        if((n&1)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}