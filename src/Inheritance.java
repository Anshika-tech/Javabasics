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
}*/
//q1.print salary and bonus of an employee by use of  inheritance.
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
}