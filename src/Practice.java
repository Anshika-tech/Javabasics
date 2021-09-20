//questions for practice
/*q1.class of student contain student name as parameterized constructor ,if no parameter given then set name
"unknown".
class Sample1{
    String s;
    Sample1()
    {
        s="unknown";
    }
    Sample1(String a)
    {
        s=a;
    }
    void show()
    {
        System.out.println(s);
    }
}
public class Practice{
    public static void main(String[] args) {
        Sample1 obj1=new Sample1();
        Sample1 obj2=new Sample1("Anshika");
        Sample1 obj3=new Sample1("Akansha");
        Sample1 obj4=new Sample1("Hritik");
        Sample1 obj5=new Sample1();
        obj1.show();
        obj2.show();
        obj3.show();
        obj4.show();
        obj5.show();
    }
}
//q2.class of book contain book'sname,author name ,price etc.
class Book{
    String name;
    String author;
    double price;
    int qtyinstock;
   Book(String a,String b,double c,int d)
    {
        name=a;
        author =b;
        price = c;
        qtyinstock=d;
    }
    void show(){
        System.out.println("name of book is -"+name+"\nname of the author is -"+author+"\nprice of book-"+price
         +"\nquantity in stock is-"+qtyinstock);
    }
}
public class Practice {
    public static void main(String[] args) {
        Book obj =new Book("let us c++","yashwant kanetkar",350.0,16);
        obj.show();
    }
}*/
//q3. create a class name Box ,and use parameterized constructor to initialize the variable length ,width,height and use method to return volume.
import java.util.*;
class Box{
    int length;
    int width;
    int height;
    Box(int l,int w,int h)
    {  length=l;
        width=w;
        height=h;
    }
    void display(){
        System.out.println("volume ="+(length*width*height));
    }
}
public class Practice{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Box obj= new Box(sc.nextInt(),sc.nextInt(),sc.nextInt());
        obj.display();
    }
}