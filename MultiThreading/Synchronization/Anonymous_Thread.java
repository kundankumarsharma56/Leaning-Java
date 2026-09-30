package MultiThreading.Synchronization;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Anonymous_Thread {
    public static void main(String[] args) {

        // This is Creating Thread as Anonymous Thread
        Thread thread = new Thread(){
          @Override
          public void run(){
              System.out.println("This is Thread Method");
          }
        };
        thread.start();


        // This is Runnable Thread as Anonymous Thread
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is Runnable Method");
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();


        // This is Callable Thread as Anonymous Thread
        Callable callable = new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("This is callable Thread");
                return null;
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(callable);
    }
}
