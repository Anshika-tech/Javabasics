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
}*/
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
        /*try{
            System.out.println("The current thread name is "+Thread.currentThread().getName());
            T3.join();
        }catch(Exception e){
            System.out.println("Exception is "+e);
        }*/

    }
}
