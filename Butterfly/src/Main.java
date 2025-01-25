//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n=10;
        int spaces=2*n-1;
        int stars=0;
        for(int i=1;i<=2*n;i++){
            if(i<=n){
                spaces=spaces-2;
                stars++;

            }else {
                spaces = spaces + 2;
                stars--;
            }
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= 2*(spaces-i); j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= stars; j++) {
                    if (j != n) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
