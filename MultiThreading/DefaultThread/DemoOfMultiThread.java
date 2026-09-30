package MultiThreading.DefaultThread;

public class DemoOfMultiThread {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();// Thread is a predefined class available in java.lang package.
        System.out.println(currentThread); // toString  Output : Thread[#1,main,5,main]
        System.out.println("Current Thread is: "+currentThread.getName());  // In thread class we have a static method currentThread()
    }
}
// JVM Create this Thread which is main Thread