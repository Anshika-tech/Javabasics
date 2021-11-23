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
}*/
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