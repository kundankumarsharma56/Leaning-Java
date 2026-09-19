package MultiThreading.DaemonThread;

public class DaemonThread1 implements Runnable{

    @Override
    public void run(){

        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread Executed...");
        }else{
            System.out.println("Normal Thread Executed...");
        }
    }

    public static void main(String[] args) {
        DaemonThread1 dt = new DaemonThread1();
        Thread t1 = new Thread(dt);
        t1.setDaemon(true);
        t1.start();
    }
}


/*
   Note : The thread which runs in the background is call as Daemon Thread
   Ex: garbage collector is a daemon thread : example


   ==> When JVM reaches end of main method, it will terminate out program.
       if JVM founds Daemon thread running it terminates that daemon thread and then it will shut down  the program.

   ==> JVM will not care about Daemon Threads running status to stop the program execution.
 */