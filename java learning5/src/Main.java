import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x=100;
        int y=20;
        Scanner input = new Scanner(System.in);
        //int x = input.nextInt();
        //int y = input.nextInt();
       // System.out.println("num1" + x);
        //System.out.println("num2" + y);
        System.out.print("enter any operation: ");

        String operation = input.nextLine();
        switch (operation) {
            case "add":
                System.out.println(x+y);
                break;
                case "sub":
                    System.out.println(x-y);
                    break;
                    case "mul":
                        System.out.println(x*y);
                        break;
                        case "div":
                            System.out.println(x/y);
                            break;
                            default:
                                System.out.println("Invalid operation");
        }

    }
}