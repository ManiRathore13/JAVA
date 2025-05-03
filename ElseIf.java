import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your age:-");
//         int age = sc.nextInt();
//         if(age>=18 && age<60){
//             System.out.println("You are an Adult.");
//         }
//         else if(age>=60){
//             System.out.println("You are a Senior Citizen.");
//         }
//         else{
//             System.out.println("You are not an Adult.");
//         }
//         sc.close();
//     }
    
// }
Scanner sc = new Scanner(System.in);
System.out.println("Enter your a choice:-");
int choice = sc.nextInt();
if(choice==1){
    System.out.println("You have selected Option 1.");

}
else if(choice==2){
    System.out.println("You have selected Option 2.");
}
else if(choice==3){
    System.out.println("You have selected Option 3.");
}
else{
    System.out.println("Invalid choice.");
}
sc.close();
}
}