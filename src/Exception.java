//Exception handling- mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
//without exception handling-
/*
public class Exception {
    public static void main(String[] args) {
           int a=10;
        System.out.println(a/0);//generate exception named arithmetic exception.
    }
}
//using exception handling-
public class Exception {
    public static void main(String[] args) {
        int a=10;
        try {
            System.out.println(a / 0);
        }catch(ArithmeticException obj){
            System.out.println(obj);
        }
        System.out.println("hello");
    }
}
//Multiple catch block to handle multiple exception
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        try{
            a=sc.nextInt();//input mismatch exception may occur.
            b=sc.nextInt();//input mismatch exception may occur.
            System.out.println(a/b);//arithmetic exception may occur.
        }
        catch(ArithmeticException obj){
            System.out.println("cannot divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("only numbers are accepted");
        }
    }
}*/
import java.util.Scanner;
public class Exception{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int a = Integer.parseInt(sc.next());//if input is in the form of string like "anshika"
            // then NumberFormatException occur.
            System.out.println("square of number is "+a*a);
        }catch(NumberFormatException e){
            System.out.println("Enter input is not valid format for an integer.");
        }
    }
}