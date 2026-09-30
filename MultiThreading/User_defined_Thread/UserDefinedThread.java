package MultiThreading.User_defined_Thread;

public class UserDefinedThread extends Thread{

    public  void run(){
        System.out.println("My thread started.....");
        m1();
        System.out.println("My thread completed....");
    }

    public  void m1(){
        System.out.println("I'm from m1 method.....");
    }

    public static void main(String[] args) {

        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();

        System.out.println(name+" Thread started...");

        UserDefinedThread udtur = new UserDefinedThread();
//        udtur.m1();

        Thread t = new Thread(udtur);
        t.start(); // Internally it will call run() method

        System.out.println(name+" Thread Ended...");
    }
}
