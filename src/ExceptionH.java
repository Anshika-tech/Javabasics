import javax.print.attribute.TextSyntax;
import java.io.IOException;

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
quiz - 1.Is code correct or not.
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
}
//2. Is code correct or not.
public class ExceptionH{
    public static void main(String[] args) {
       try {
           int i = Integer.parseInt(args[0]);
           System.out.println(i);
       }// generate error as try without catch or finally.
        System.out.println("main method");
       catch(NumberFormatException e){
            System.out.println("exception"+e);
        }
    }
}
code is not correct.
//q. enter the marks of student and caught the Number Format exception ,if comes, with try and catch block.Also create a custom exception
//for handling the marks less than 0 and greater than 100.
import java.util.Scanner;
class MYException extends Exception{
    MYException(String s){
        super(s);
    }
}
public class ExceptionH{
    static void Invalid(int num)throws MYException{
            throw new MYException("invalid number");
    }
    public static void main(String[] args) {
        System.out.println("enter names of two students");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++){
            String s=sc.next();
        }
        int s=0,s1=0;
        System.out.println("enter the marks of students in three subjects");
        try {
            for(int i=0;i<3;i++) {
                int a = Integer.parseInt((sc.next()));
                if(a<0 || a>100)
                    Invalid(a);
                s=s+a;
            }
            System.out.println("average ="+s/3);
            for(int i=0;i<3;i++) {
                int b = Integer.parseInt((sc.next()));
                if(b<0||b>100)
                    Invalid(b);
                s1=s1+b;
            }
            System.out.println("average="+s1/3);
         }catch(NumberFormatException obj){
            System.out.println("exception caught"+obj);
        }
        catch(MYException e){
            System.out.println("My Exception caught");
        }
    }
}
//throws keyword -The Java throws keyword is used to declare an exception.
// It gives an information to the programmer that there may occur an exception. only applicable on checked exception.
class Testthrow{
    void m()throws IOException{
        throw new IOException("device error");
    }
    void p()throws IOException{
        m();
    }
    void n(){
        try{
            p();
        }catch(Exception e){
            System.out.println("Exception handled");
        }
    }
}
public class ExceptionH{
    public static void main(String[] args) {
        Testthrow obj=new Testthrow();
         obj.n();
        System.out.println("end of main method");
    }
}
//2. Example-
class Test{
    void m1()throws InterruptedException{
        m2();
    }
    void m2()throws InterruptedException{
        Thread.sleep(1000);
    }
}
public class ExceptionH{
    public static void main(String[] args)throws InterruptedException {
        Test obj=new Test();
        obj.m1();
        System.out.println("hello");
    }
}
//Try with resource concept-
// try statement that declares one or more resources.
import java.util.Scanner;
public class ExceptionH{
    public static void main(String[] args) {
       try(Scanner sc=new Scanner(System.in)){
          int i=Integer.parseInt(sc.next());
       }catch(Exception obj){
           obj.printStackTrace();
       }
        System.out.println("end of main method");
    }
}
//Lambda expression
//Lambda expression provides implementation of functional interface. An interface which has only one abstract method is called functional interface.
//     Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.
interface Drawable{
     void draw();
}
public class ExceptionH{
    public static void main(String[] args) {
        int width=10;
       Drawable obj=()-> System.out.println("Drawing "+width);
       obj.draw();
    }
}*/
//lambda expression with no parameter.
interface Sayable{
     String say();
}
public class ExceptionH {
    public static void main(String[] args) {
        Sayable obj =()-> {return "hello";};
        System.out.println(obj.say());
    }
}