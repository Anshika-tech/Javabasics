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
}*/
//q drawable example.
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