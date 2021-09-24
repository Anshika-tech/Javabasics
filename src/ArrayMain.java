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
import java.util.Scanner;
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
}