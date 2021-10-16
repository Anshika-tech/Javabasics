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
}*/
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