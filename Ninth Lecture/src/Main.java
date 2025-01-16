import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings:");
        String input = scanner.nextLine();
        int alphabet=0, digit=0, specialCharacter=0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isAlphabetic(ch)) {
                alphabet++;

            } else if (Character.isDigit(ch)) {
                digit++;

            } else {
                specialCharacter++;
            }
        }
        System.out.println("Alphabet " + alphabet);
        System.out.println("Digit "+ digit);
        System.out.println("Special "+ specialCharacter);
        scanner.close();


    }
}