package MultiThreading.DeadLock;

public class ExOfDeadLock {

    public static void main(String[] args) {

        String s1 = "Hi";
        String s2 = "Hello";
        Thread thread = new Thread(){
            public void run(){
                synchronized (s1){
                    System.out.println("Thread-1 Lock resource-1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (s2) {
                        System.out.println("Thread-2 waiting for resource-2");
                    }
                }
            }
        };


        Thread thread1 = new Thread(){
          public void run(){
              synchronized (s2){
                  System.out.println("Thread-2 Lock resource-2");
                  try {
                      Thread.sleep(100);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }

                  synchronized (s1) {
                      System.out.println("Thread-1 waiting for resource-1");
                  }
              }
          }
        };



        thread.start();
        thread1.start();
    }
}


/*
  DeadLock
   Deadlock means ambiguity problem among the threads
   If 2 threads are waiting for each other to release the resources is called as dead lock.
   once we get into deadlock situation then we can't do anythings

   Example:
   Thread-1 holding resource-1 and waiting for resource-2
   Thread-2 holding resource-2 and waiting for resource-1

 */