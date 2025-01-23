////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        String s="MANIBHOOSHAN";
//       String lowerCaseString=s.toLowerCase();
//        System.out.println("Lowercase String: "+lowerCaseString);
//
//
//    }
//}
//Reverse String
public class Main {
    public static void main(String[] args) {
        String OriginalString= "My name is Manibhooshan Rathore";
        String reversedString=new StringBuilder(OriginalString).reverse().toString();
        System.out.println("Reversed String is: " +reversedString);
    }
}