/* local variable , instance variable , static variable .
 local variable - declares inside the method ,constructor ,block.
 instance variable -declares inside the class but outside the method or constructor or block. we can access
 instance variable by creating object.
 static variable-we can access variable by class name .it declares inside the class but outside the method or
 constructor or block but it declares with static modifier.
 */
public class Variable {
    int a=10;
    static int c=30;
    public static void main(String[] args) {
        int b=20;
        Variable obj=new Variable();
        System.out.println("instance Variable="+obj.a);
        System.out.println("local variable="+b);
        System.out.println("static variable ="+c);
    }


}
