package MultiThreading.User_defined_Thread;

public class UserDefindThread_UsingExtending extends Thread{
    public  void run(){
        System.out.println(" User Defined Thread Started...");
        System.out.println("i'm from run Method() ");
        System.out.println(" User Defined Thread Ended...");
    }
    public static void main(String[] args) {

        System.out.println("main Thread started...");

        UserDefindThread_UsingExtending udt = new UserDefindThread_UsingExtending();
        Thread thread = new Thread(udt); // Making our class obj association with Thread
        thread.start(); // Thread will start

        System.out.println("main Thread Completed ");
    }
}
