//Inheritance - one class/object acquires all the properties of parent class/object.
//subclass /child class: it is a class which inherits the other class,also called a derived class,extended class
//Super class/parent class:it is class from where a subclass inherits the features,also called base class.

/*class Dog{     //Super class
    void eat(){
        System.out.println("Dog is eating ");
    }
}
class BabyDog extends Dog {
    void bark(){
        System.out.println("Baby dog is crying");
    }
}
public class Inheritance{
    public static void main(String[] args) {
        BabyDog obj=new BabyDog();
        obj.bark();
        obj.eat();
    }
}
//q1.print salary and bonus of an employee by use of inheritance.
class Employee{
    float salary=40000;
}
class programmer extends Employee{
    float bonus=10000;
    public static void main(String[] args) {
        programmer obj=new programmer();
        System.out.println(obj.salary);
        System.out.println(obj.bonus);
    }
}*/
//create one parent class and subclass and then create two classes, one inherit parent class and other inherit
//subclass.
import java.util.Scanner;
class Person{
    void m1(){
        System.out.println("enter salary and subject of teacher");
    }
}
class Student extends Person{
    void m2(){
        System.out.println("enter year and course of college student");
    }
}
class Teacher extends Person{
    void run(int a,String sub){
        System.out.println(a+" "+sub);
    }
}
class collegestu extends Student{
    void walk(int year,String course){
        System.out.println(year+" "+course);
    }
}
public class Inheritance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        collegestu obj=new collegestu();
        obj.m2();
        obj.walk(sc.nextInt(),sc.next());
        sc.next();
        Teacher obj1=new Teacher();
        obj1.m1();
        obj1.run(sc.nextInt(),sc.next());
    }
}