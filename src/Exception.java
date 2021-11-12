//Exception handling- mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
//without exception handling-
/*
public class Exception {
    public static void main(String[] args) {
           int a=10;
        System.out.println(a/0);//generate exception named arithmetic exception.
    }
}*/
//using exception handling-
public class Exception {
    public static void main(String[] args) {
        int a=10;
        try {
            System.out.println(a / 0);
        }catch(ArithmeticException obj){
            System.out.println(obj);
        }
        System.out.println("hello");
    }
}
