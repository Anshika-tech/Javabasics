/* class - class are user defined data types that can hold both data and method.
A class is a collection of objects that have identical properties, common behavior and shared relationship.
object- An object is a collection of data members and associated member functions.
 */

class Test{
    int a; //instance variable
    String name; //instance variable
    void eat(){// method or function
        System.out.println(name+" is eating");
    }
    void walk(){
        System.out.println(name + " is walking");
    }

}
public class TestMain {
    public static void main(String[] args) {
        Test obj1 =new Test(); //creating object of class Test
        obj1.a= 10;  //initialisation of object.
        obj1.name= "Anshika";
        Test obj2=new Test();
        obj2.a=20;
        obj2.name="hritik";
        System.out.println(obj1.a+" "+obj1.name);
        System.out.println(obj2.a+" "+obj2.name);
        obj1.eat(); //method call
        obj2.walk();

    }

}