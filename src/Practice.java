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
/*import java.util.*;
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
}*/
//q4. create a class name student having name and percentage and another class Test1 that contains instance of student class.print output name
// and percentage
/*class Student {
    String name;
    double percentage;
}
class Test1{
    Student obj;
    Test1(String a,double p){
        obj= new Student();
        obj.name=a;
        obj.percentage=p;
    }
}
public class Practice{
    public static void main(String[] args) {
        Test1 obj1=new Test1("anshika",91.7);
        System.out.println(obj1.obj.name);
        System.out.println(obj1.obj.percentage);
    }
}
//q5.check whether a no. is palindrome or not.
import java.util.Scanner;
public class Practice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
          int t=n,r,s=0;
          while(t>0){
              r=t%10;
              s=r+s*10;
              t=t/10;
          }
         if(n==s)
             System.out.println("palindrome");
         else
             System.out.println("not palindrome");
    }
}
//create a class contains name ,weight,height and print it.
import java.util.Scanner;
class STU2 {
    String name;
    double weight;
    double height;
    STU2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = in.nextLine();

        System.out.println("Enter your weight: ");
        weight = in.nextDouble();

        System.out.println("Enter your height: ");
        height = in.nextDouble();
    }
    void BMI() {
        double bmi;
        bmi = (weight / (height * height)) * 703;
        System.out.println("You entered string " + name);
        System.out.println("Your weight is " + weight);
        System.out.println("Your height is " + height);
        System.out.println("Your bmi is " + bmi);
    }
}
public class Practice{
    public static void main(String[] args) {
        STU2 obj=new STU2();
        obj.BMI();
    }
}
//count no of instance of class .
class Count{
    int num1;
    int num2;
    static int  c=0;
    //instance block always execute first before constructor when object created .
    {
        c++;
    }
    public Count(){
        num1=10;
        num2=20;
    }
    public Count(int ta,int tb){
        num1=ta;
        num2=tb;
    }
    void result(){
        System.out.println(num1);
        System.out.println(num2);
    }
}
public class Practice {
    public static void main(String[] args) {
        Count obj1=new Count();
        Count obj2=new Count(30,40);
        Count obj3=new Count(50,76);
         obj1.result();
         obj2.result();
         obj3.result();
        System.out.println(Count.c);//static variable always access by the name of class.
    }
}
//create a class contains private member and access them .
//note- we can access private member by using method getter setter.
import java.util.Scanner;
class Out{
    private int x;
    private int y;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getXY(){
        return x*y;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class Practice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Out obj=new Out();
        obj.setX(sc.nextInt());
        System.out.println(obj.getX());
        obj.setXY(sc.nextInt(),sc.nextInt());
        System.out.println(obj.getXY());
        obj.setY(sc.nextInt());
        System.out.println(obj.getY());
    }
}*/
// create interface name test contain member function square .Implement this interface in Arithmetic class.
interface Test5{
    void square();
}
class Arithmetic implements Test5{
    public void square(){
        System.out.println(2*2);
    }
}
public class Practice{
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        obj.square();
    }
}