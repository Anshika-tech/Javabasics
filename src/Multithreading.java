//multithreading- Multithreading in Java is a process of executing multiple threads simultaneously.
public class Multithreading {
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
