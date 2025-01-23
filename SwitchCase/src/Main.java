import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
       System.out.println("choose a operation(sum/minus/division/multiply)");

        String operation= scanner.nextLine();

        switch (operation){
            case "sum":
                System.out.println(n+m);
                break;
                case "minus":
                    System.out.println(n-m);
                    break;
                    case "division":
                        System.out.println(n/m);
                        break;
                        case "multiply":
                            System.out.println(n*m);
                            break;
                            default:
                                System.out.println("error");
                                break;
        }

        }
        }
