import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Second number:");
        int secondNumber = scanner.nextInt();
        //int result=firstNumber & secondNumber;
        //int result1=firstNumber | secondNumber;
        int result2=firstNumber ^ secondNumber;

        //System.out.println(result);
      //  System.out.println(result1);
        System.out.println(result2);

    }
}