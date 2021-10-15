/* interface is blueprint of class .There can be only abstract method in interface not method body.
used to achieve abstraction and multiple inheritance in java.
 */
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
