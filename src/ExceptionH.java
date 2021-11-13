//Exception handling- mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
//without exception handling-
/*
public class ExceptionH {
    public static void main(String[] args) {
           int a=10;
        System.out.println(a/0);//generate exception named arithmetic exception.
    }
}
//using exception handling-
public class ExceptionH {
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
public class ExceptionH{
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
}
import java.util.Scanner;
public class ExceptionH{
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
//custom Exception
import java.util.Scanner;
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}
public class ExceptionH{
    static void validate(int age)throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            validate(sc.nextInt());
        }catch(InvalidAgeException e){
            System.out.println("exception occurred : "+e);
        }
        System.out.println("hello");
    }
}
// input array size and its element .print element of any index .if exception generate handle it with try and catch and print name of exception.
import java.util.Scanner;
public class ExceptionH{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int a[]=new int[sc.nextInt()];
        System.out.println("enter the elements of array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the index");
        int n=sc.nextInt();
        try{
            System.out.println(a[n]);
        }catch(ArrayIndexOutOfBoundsException obj){
            System.out.println("exception :"+obj);
        }
    }
}
quiz -
public class ExceptionH{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(Exception e){
            e.printStackTrace();
        }
        catch(ArithmeticException e){//it produces error because arithmetic exception already caught in Exception class .
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}*/
