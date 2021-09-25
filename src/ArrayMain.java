//q1. print sum of array .
/*import java.util.Scanner;
public class ArrayMain {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int s=0;
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
            s=s+a[i];
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("sum of array is ="+s);
    }
}*/
//q2.find max value in array.
/*import java.util.Scanner;
public class ArrayMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]= new int[sc.nextInt()];
        for(int i=0;i<a.length;i++)
        {
           a[i]=sc.nextInt();
        }
        int m=a[0];
        for(int i=1;i<a.length;i++) {
            if(a[i]>=m)
            {
                m=a[i];
            }
        }
        System.out.println("maximum value in array="+m);
    }
}*/
//array of object.
//q3.print roll no and name of the student store in array.
import java.util.Scanner;
class stu2{
    int roll;
    String name;
}
public class ArrayMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stu2 a[] = new stu2[sc.nextInt()];// declaration of object of array.
        for(int i=0;i<a.length;i++) {
            a[i]=new stu2();
            System.out.println("enter the roll no and name of student");
            a[i].roll=sc.nextInt();
            a[i].name=sc.next();
        }
        for (int i=0;i<a.length;i++) {
            System.out.println("roll no ="+a[i].roll+"  ,"+"name of student="+a[i].name);
        }
    }

}