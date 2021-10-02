/*q1. print sum of array .
import java.util.Scanner;
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
}
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
//q4.search element in an array.
import java.util.Arrays;
import java.util.Scanner;
public class ArrayMain{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. that you want to search");
       int element=sc.nextInt();
        System.out.println("enter the size of array.");
       int[] arr =new int[sc.nextInt()];
        System.out.println("enter the elements of array");
       for(int i=0;i<arr.length;i++) {
           arr[i]=sc.nextInt();
       }
        Arrays.sort(arr);
       int lo=0,hi=arr.length-1,mid;
       while(hi-lo>1) {
            mid=(hi+lo)/2;
            if(element>arr[mid])
                lo=mid+1;
            else
                hi=mid;
       }
       if(element==arr[lo])
           System.out.println("element found in "+lo+"index");
       else if(element==arr[hi])
           System.out.println("element found in "+hi+"index");
       else
           System.out.println("-1");
    }
}
//q5.initialize integer array with ascii value and print character value in single row.
import java.util.Scanner;
public class ArrayMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i:arr)
        {
            System.out.print((char)(i)+ " ");
        }
    }
}
//q6.create an array of int type and if element is 1 or 4 then print true otherwise print false.
import java.util.Scanner;
public class ArrayMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),f=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i:arr){
            if(i==4 || i==1){
                f=1;
            }
            else {
                f=0;
                System.out.println("False");
                break;
            }
        }
        if(f==1)
            System.out.println("True");
    }
}*/
//array of objects.
/*q7.create array of objects storing id,employee name,company name A and B,salary .if salary of two employee
is different in same company print maximum salary.*/
import java.util.Scanner;
class Employee {
    int id;
    String name;
    String c_name;
    int sal;
    public Employee(String c_name, String name, int id, int sal) {
        this.c_name = c_name;
        this.name = name;
        this.id = id;
        this.sal = sal;
    }
    public static void result(Employee tarr[]) {
        int max_sal1 = Integer.MIN_VALUE, max_sal2 = Integer.MIN_VALUE;
        int Aindex = 0, Bindex = 0;
        for (int i = 0; i < tarr.length; i++) {
            if (tarr[i].c_name.equals("A") && tarr[i].sal > max_sal1) {
                max_sal1 = tarr[i].sal;
                Aindex = i;
            }
            if (tarr[i].c_name.equals("B") && tarr[i].sal > max_sal2) {
                max_sal2 = tarr[i].sal;
                Bindex = i;
            }
        }
        System.out.println("employee name= " + tarr[Bindex].name + ",sal= " + tarr[Bindex].sal + ",company name= " + tarr[Bindex].c_name);
        System.out.println("employee name= " + tarr[Aindex].name + ",sal= " + tarr[Aindex].sal + ",company name= " + tarr[Aindex].c_name);
    }
}
public class ArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of object");
        int size = sc.nextInt();
        Employee arr[] = new Employee[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter company_name, employee_name,id,salary");
            arr[i] = new Employee(sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
        }
        Employee.result(arr);
    }
}
