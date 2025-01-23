import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number(1-7):- ");

        int n = scanner.nextInt();

        switch(n){
            case 1:
                System.out.println("The day is Sunday");
                break;
                case 2:
                    System.out.println("The day is Monday");
                    break;
                    case 3:
                        System.out.println("The day is Tuesday");
                        break;
                        case 4:
                            System.out.println("The day is Wednesday");
                            break;
                            case 5:
                                System.out.println("The day is Thursday");
                                break;
                                case 6:
                                    System.out.println("The day is Friday");
                                    break;
                                    case 7:
                                        System.out.println("The day is Saturday");
                                        break;
                                        default:
                                            System.out.println("Invalid input");
                                            break;

        }

    }
}
948842672