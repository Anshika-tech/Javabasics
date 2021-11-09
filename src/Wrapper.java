//Autoboxing -conversion of primitive datatype into its corresponding wrapper class
/*public class Wrapper {
    public static void main(String[] args) {
    int a=20;
    Integer i=Integer.valueOf(a);//change int to Integer explicitly
    Integer j=a;//autoboxing, compiler will write Integer.valueOf(a) internally
        System.out.println(a+" "+i+" "+j);
    }
}*/
//unboxing -the automatic conversion of wrapper class into its corresponding primitive datatype.
public class Wrapper {
    public static void main(String[] args) {
     Integer a=new Integer(7);
     int i=a.intValue();// convert Integer into datatype int explicitly
     int j=a;//unboxing,compiler will write a.intValue() internally
        System.out.println(a+" "+i+" "+j);
    }
}
