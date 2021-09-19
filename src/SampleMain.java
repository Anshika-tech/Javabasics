//  constructor
//1.Default constructor
/*class Sample {
    int a;
    String name;
    void display()
    {
        System.out.println(a+" "+name); //print 0 null as default value of integer is 0 and string is Null.
    }

}
public class SampleMain{
    public static void main(String[] args) {
        Sample obj =new Sample();
        obj.display();
    }
}*/
//2.parameterized constructor
/*class Constructor{
    int a;
    String name;
    Constructor(int ta,String  tb)
    {
        a=ta;
        name=tb;
    }
    void display() {
        System.out.println(a + " " +name);
    }
}
public class SampleMain
{
    public static void main(String[] args) {
        Constructor obj =new Constructor(10,"WELCOME TO OOPS");
        obj.display();

    }
}*/
//3. constructor overloading
class Overloading{
    int a,age;
    String name;
    Overloading(int ta,String tb) {
        a=ta;
        name=tb;
    }
    Overloading(int ta,String tb,int tc) {
        a=ta;
        name=tb;
        age=tc;
    }
    void display(){
        System.out.println(a+ " " +name+" " +age);
    }
}
public class SampleMain{
    public static void main(String[] args) {
        Overloading obj=new Overloading(10,"hi");
        Overloading obj2=new Overloading(20,"hello",18);
        obj.display();
        obj2.display();
    }
}
