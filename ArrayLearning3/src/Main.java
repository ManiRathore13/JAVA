import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = "ghi";
        String result= "The first six alphabets are "+(s1+s2+s3);
        System.out.println(result);
        StringBuilder sb =new StringBuilder();
        sb.append(s1);
        sb.append(s2);
        sb.append(s3);
        System.out.println("The first six alphabets are "+sb);



    }
}