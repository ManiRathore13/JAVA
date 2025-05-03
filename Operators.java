//Arithmatic Operator
public class Operators {
    public static void main (String args[]){
        // int num1=3333;
        // int num2=456;
        // System.out.println("Substraction:"+(num1-num2));
        // System.out.println("Addition:"+(num1+num2));
        // System.out.println("Multiplication:"+(num1*num2));
        // System.out.println("Diviosn:"+(num1/num2));
        // //Modulus
        // System.out.println(10%20); //numerator value is less than denominator so output will be only numerator's value
        // System.out.println(20%3); //numerator value is greater than denominator so output will be 2

        //Increment and Decrement
        //Post Increment 
        int a=10;
        int b=a++;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        
        //Pre Increment
        int c=10;
        int d=++c;
        System.out.println("c:"+c);
        System.out.println("d:"+d);

        //Pre Decrement
        int e=10;
        int f=--e;
        System.out.println("e:"+e);
        System.out.println("f:"+f);

        //Post Decrement        
        int i=10;
        int j=i--;
        System.out.println("i:"+i);
        System.out.println("j:"+j);

        //Assignment Operator
        int num1=10;
        int num2=20;    
        num1+=num2; //num1=num1+num2
        System.out.println("num1:"+num1);
        num1-=num2; //num1=num1-num2
        System.out.println("num1:"+num1);
        num1*=num2; //num1=num1*num2
        System.out.println("num1:"+num1);
        num1/=num2; //num1=num1/num2
        System.out.println("num1:"+num1);
        num1%=num2; //num1=num1%num2    
        System.out.println("num1:"+num1);

        //Relational Operator
         int num3=10;
            int num4=20;
            System.out.println(num3==num4); //false
            System.out.println(num3!=num4); //true
            System.out.println(num3>num4); //false
            System.out.println(num3<num4); //true
            System.out.println(num3>=num4); //false
            System.out.println(num3<=num4); //true

        //Logical Operator
        boolean a1=true;
        boolean a2=false;
        System.out.println(a1 && a2); //false
        System.out.println(a1 || a2); //true
        System.out.println(!a1); //false
        System.out.println(!a2); //true

        //Bitwise Operator
        int a3=10; //00001010
        int a4=20; //00010100
        System.out.println(a3 & a4); //00000000
        System.out.println(a3 | a4); //00011110
        System.out.println(a3 ^ a4); //00011110
        System.out.println(~a3); //11110101
        System.out.println(a3 << 2); //00101000
        System.out.println(a3 >> 2); //00000010
        System.out.println(a3 >>> 2); //00000010

        //Ternary Operator
        int a5=10;
        int a6=20;
        int max=(a5>a6)?a5:a6; //if a5 is greater than a6 then max will be a5 otherwise a6
        System.out.println("Max:"+max);

        //Instanceof Operator
        String str="Hello";
        boolean result=str instanceof String; //check if str is an instance of String class
        System.out.println("Is str an instance of String class? "+result);
        
        //String Operator
        String str1="Hello";
        String str2="World";
        String str3=str1+str2; //concatenation of two strings
        System.out.println("Concatenated String:"+str3);

         
           
    }
    
}
//