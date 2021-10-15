/*Abstraction is the process of hiding implementing details and showing only functionality to user.
note- 1.you can't create object of abstract class but you can make reference variable of abstract class.
2. if a class has any abstract methods whether declared or inherited,the entire class must be declared abstract.

abstract class Bike{  //abstract class
    abstract void run();  //abstract method.
}
class Honda extends Bike{
    void run(){
        System.out.println("Running safely");
    }
}
public class Abstraction {
    public static void main(String[] args) {
      Bike obj=new Honda();//create reference of abstract class.
      obj.run();
    }
}
//create  abstract class shape and subclasses rectangle and circle.
import java.util.Scanner;
abstract class Shape{
     abstract void run();
}
class Rectangle extends Shape{
    void run(){
        System.out.println("Drawing rectangle");
    }
}
class Circle extends Shape{
     void run(){
         System.out.println("Drawing circle");
     }
}
public class Abstraction{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Shape obj=new Rectangle();
        Shape obj1=new Circle();
        obj.run();
        obj1.run();
    }
}*/
//abstract class having constructor ,data member,methods.
abstract class Bike{
    Bike(){
        System.out.println("bike is created");
    }
    abstract void run();
    void changegear(){
        System.out.println("change gear");
    }
}
class Honda extends Bike{
    void run(){
        System.out.println("running safely");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        Bike obj=new Honda();
         obj.run();
         obj.changegear();
    }
}