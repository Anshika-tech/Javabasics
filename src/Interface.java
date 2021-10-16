/* interface is blueprint of class .There can be only abstract method in interface not method body.
used to achieve abstraction and multiple inheritance in java.

interface Printable{
    void print();
}
class Interface implements Printable{
   public void print(){
        System.out.println("welcome");
    }
    public static void main(String[] args) {
        Interface obj=new Interface();
        obj.print();
    }
}
//q1. drawable example.
interface Shape{
    void draw();
}
class Rectangle implements Shape{
   public void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circle implements Shape{
    public void draw(){
        System.out.println("drawing circle");
    }
}
public class Interface{
    public static void main(String[] args) {
        Shape obj=new Rectangle();
        Shape obj1=new Circle();
        obj.draw();
        obj1.draw();
    }
}
//q2.Bank example
interface Bank{
    float RateOfInterest();
}
class SBI implements Bank{
    public float RateOfInterest(){
        return 9.17f;
    }
}
class PNB implements Bank{
    public float RateOfInterest(){
        return 9.6f;
    }
}
public class Interface{
    public static void main(String[] args) {
        Bank obj=new SBI();
        System.out.println("ROI: "+obj.RateOfInterest());
        Bank obj1=new PNB();
        System.out.println("ROI: "+obj1.RateOfInterest());
    }
}
//multiple inheritance by interface
interface printable{
    void print();
}
interface showable{
    void show();
}
class Inheritance implements printable,showable{
    public void print(){
        System.out.println("print love");
    }
    public void show()
    {
        System.out.println("show love");
    }
    public static void main(String[] args) {
       Inheritance obj=new Inheritance();
       obj.print();
       obj.show();
    }
}
//interface inheritance
interface printable{
    void print();
}
interface showable extends printable{
    void show();
}
class Interface implements showable{
    public void print(){
        System.out.println("print");
    }
    public void show(){
        System.out.println("show");
    }
    public static void main(String[] args) {
        Interface obj=new Interface();
        obj.print();
        obj.show();
    }
}
// default method in java. you can define body of a method in interface by using default method.
interface Bike{
    void fun();
   default void run(){
       System.out.println("bike is ready");
    }
}
class Honda implements Bike{
    public void fun(){
        System.out.println("have fun");
    }
}
class Interface{
    public static void main(String[] args) {
        Bike obj=new Honda();
        obj.run();
        obj.fun();
    }
}*/
//static method in interface.
import java.util.Scanner;
interface Drawable{
    void draw();
    static int cube(int x){
        return x*x*x;
    }
}
class Area implements Drawable{
    public void draw(){
        System.out.println("draw a cube of area");
    }
}
class Interface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Drawable obj=new Area();
        System.out.println("enter the side of cube");
        int n=sc.nextInt();
        obj.draw();
        System.out.println(Drawable.cube(n));
    }
}