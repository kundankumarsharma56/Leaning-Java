package MultiThreading.DefaultThread;

public class Exa extends Thread{

    public static void main(String[] args) {

        Thread currentThread = Thread.currentThread();

        System.out.println("Name: "+currentThread.getName());
        System.out.println("Group: "+currentThread.getThreadGroup());
        System.out.println("Priority: "+currentThread.getPriority());
    }
}
