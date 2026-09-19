package MultiThreading.User_defined_Thread;

public class SleepMode implements Runnable{
    public  void run(){ // Run method doesn't return anythings and not any parameter
        System.out.println("Run() Method started by..."+Thread.currentThread().getName());

        try {
            Thread.sleep(15000); // block stat e
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Run () method ended by...."+Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        SleepMode sm = new SleepMode();

        Thread t = new Thread(sm);
        Thread t1 = new Thread(sm);
        Thread t2 = new Thread(sm);

//        t.start(); // java.lang.IllegalThreadStateException ->  Note : We shouldn't start one thread more than one time
        t.start();// Runnable state
        t1.start();// Runnable state
        t2.start();// Runnable state


    }
}
