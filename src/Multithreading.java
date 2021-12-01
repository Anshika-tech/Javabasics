//multithreading- Multithreading in Java is a process of executing multiple threads simultaneously.
/*public class Multithreading {
        public static void main(String[] args) {
            Thread obj=Thread.currentThread();//It returns a reference to the currently executing thread object.
            System.out.println(obj.getName());//It returns the name of the thread.
            obj.setName("Anshika");//It changes the name of the thread.
            obj.setPriority(Thread.MIN_PRIORITY);
            System.out.println(obj.getId());//It returns the id of the thread.
            System.out.println(obj.isAlive());//It tests if the thread is alive.
            System.out.println(obj.getPriority());//It returns the priority of the thread.
            System.out.println(obj.isDaemon());//It tests if the thread is a daemon thread.
        }
}
// two ways to create Thread
//1. by extending Thread class
class Test extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
      Test T1=new Test();
      T1.start();
    }
}
//2.by implementing Runnable interface
class Test implements Runnable{
    public void run(){
        System.out.println("Thread is running ");
    }
    public static void main(String[] args) {
        Test m1 =new Test();
        Thread T1=new Thread(m1);
        T1.start();
    }
}
//q.create thread which print 1 to 10 after printing 5 ,there should be delay of 5000 before
// printing 6.
class Test extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                if (i != 6)
                    System.out.println(i);
                else
                {
                    Thread.sleep(5000);
                    System.out.println(i);
                }
            }catch(Exception e){
                System.out.println("exception is :"+e);
            }
        }
    }
}
public class Multithreading{
    public static void main(String[] args) {
        Test T1=new Test();
        T1.start();
    }
}
//join()-The join() method in Java is provided by the java.lang.Thread class that permits one thread to wait
//until the other thread to finish its execution.
class Test extends Thread{
    public void run(){
        for(int i=0;i<2;i++){
           try{
               Thread.sleep(300);
               System.out.println("Current Thread name is"+Thread.currentThread().getName());
           }catch(Exception e){
               System.out.println("Exception has been caught"+e);
           }
            System.out.println(i);
        }
    }
}
public class Multithreading{
    public static void main(String[] args) {
        Test T1=new Test();
        Test T2=new Test();
        Test T3=new Test();
        T1.start();
        // starting the second thread after when
      // the first thread th1 has ended or died.
        try{
            System.out.println("The current thread name is"+Thread.currentThread().getName());
            T1.join();
        }catch(Exception e){
            System.out.println("Exception is "+e);
        }
        T2.start();
        try{
            System.out.println("The current thread name is "+Thread.currentThread().getName());
            T2.join();
        }catch(Exception e){
            System.out.println("Exception is "+e);
        }
        T3.start();
    }
}

//another example of join() method.
class Test extends Thread{
    public void run(){
     for(int i=0;i<=5;i++){
         try{
             Thread.sleep(500);
         }catch(Exception e){
             System.out.println("Exception is"+e);
         }
         System.out.println(i);
     }
    }
}
public class Multithreading {
    public static void main(String[] args) {
        Test T1=new Test();
        Test T2=new Test();
        Test T3=new Test();
        T1.start();
        try{
            T1.join();
        }catch(Exception e){
            System.out.println("Exception is "+e);
        }
        T2.start();
        T3.start();
    }
}
//Synchronisation concept.
//Synchronisation in Java is the capability to control the access of multiple threads to any shared resource.
class Table{
    synchronized void print_table(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
        }
        try{
            Thread.sleep(400);
        }catch(Exception e){
            System.out.println("Exception is "+e);
        }
    }
}
class Thread1 extends Thread{
    Table t;
    Thread1(Table t){
        this.t=t;
    }
    public void run(){
        t.print_table(5);
    }
}
class Thread2 extends Thread{
    Table t;
    Thread2(Table t){
        this.t=t;
    }
    public void run(){
        t.print_table(100);
    }
}
class Multithreading{
    public static void main(String[] args) {
            Table obj=new Table();
            Thread1 T1=new Thread1(obj);
            Thread2 T2=new Thread2(obj);
            T1.start();
            T2.start();
    }
}
//example of synchronisation by using anonymous concept.
class Table {
    synchronized void Print_table(int n){
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){
                System.out.println("Exception is "+e);
            }
        }
    }
}
public class Multithreading{
    public static void main(String[] args) {
        final Table obj=new Table();
       Thread T1=new Thread(new Runnable() {
           @Override
           public void run() {
               obj.Print_table(5);
           }
       });
        Thread T2=new Thread(new Runnable() {
            @Override
            public void run() {
                obj.Print_table(100);
            }
        });
        T1.start();
        T2.start();
    }
}
//create two thread,one thread print all even number between 1 and 20 followed by other thread
// print all odd number between 1 and 20.
class Test{
    synchronized void print_odd(){
        for(int i=1;i<=20;i++){
            if(i%2==0){
                try{
                    Thread.sleep(500);
                }catch(Exception e){
                    System.out.println("Exception is"+e);
                }
                System.out.println(i);
            }
        }
    }
    synchronized void print_even(){
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                try{
                    Thread.sleep(500);
                }catch(Exception e){
                    System.out.println("Exception is"+e);
                }
                System.out.println(i);
            }
        }
    }
}
public class Multithreading{
    public static void main(String[] args) {
        Test obj=new Test();
        Thread T1=new Thread(()->{
            obj.print_even();
        });
        Thread T2=new Thread(()->{
            obj.print_odd();
        });
        T1.start();
        T2.start();
    }
}
//Thread priority concept
public class Multithreading extends Thread{
    public void run(){
        System.out.println("inside run method");
    }
    public static void main(String[] args) {
     Multithreading T1=new Multithreading();
     Multithreading T2=new Multithreading();
     Multithreading T3=new Multithreading();
        System.out.println("priority of thread T1 "+T1.getPriority());
        System.out.println("priority of thread T2 "+T2.getPriority());
        System.out.println("priority of thread T3 "+T3.getPriority());
        T1.setPriority(6);
        T2.setPriority(3);
        T3.setPriority(9);
        System.out.println("priority of thread T1 "+T1.getPriority());
        System.out.println("priority of thread T2 "+T2.getPriority());
        System.out.println("priority of thread T3 "+T3.getPriority());
        System.out.println("currently executing the thread :"+Thread.currentThread().getName());
        System.out.println("priority of main thread :"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("priority of main thread: "+Thread.currentThread().getPriority());
    }
}*/
//notify() and wait()
class Test extends Thread{
    int total=0;
    public void run(){
        synchronized(this){
            for(int i=0;i<10;i++){
                total=total+1;
            }
            this.notify();
        }
    }
}
public class Multithreading{
    public static void main(String[] args) {
        Test obj=new Test();
        obj.start();
        synchronized (obj){
            try{
                obj.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(obj.total);
        }
    }
}


