/*Abstraction is the process of hiding implementing details and showing only functionality to user.
note- 1.you can't create object of abstract class but you can make reference variable of abstract class.
2. if a class has any abstract methods whether declared or inherited,the entire class must be declared abstract.
 */
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
