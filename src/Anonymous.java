/*Anonymous inner class -class that has no name ,for which only a single object created ,used if you have to override a method of class or interface.
it can be created in two ways:
1.class(abstract or concrete)
2.interface
 */
abstract class Person{
    abstract void eat();
}
public class Anonymous {
    public static void main(String[] args) {
        Person p = new Person() {
            void eat() {
                System.out.println("nice fruits.");
            }
        };
        p.eat();
    }
}
