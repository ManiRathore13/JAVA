import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = scanner.nextInt();
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        int sum=1;
        for(int i=0;i<n;i++){
            //sum=n1*arr[i];
            System.out.print(n1*arr[i]+" ");

        }

        //int avg=sum/n;
       // System.out.println(sum);
    }
}