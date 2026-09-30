package MultiThreading.NormalThread_IncludingJoinEtc;

public class Join {
    public static void main(String[] args) throws Exception {
         Thread thread = new Thread(){
             public void run(){
                 for (int i = 1; i <= 5; i++) {
                     System.out.println(Thread.currentThread().getName()+": "+i);
                     try {
                         Thread.sleep(1000);
                     }catch (Exception exception){
                         exception.printStackTrace();
                     }
                 }
             }
         };
         thread.setName("Thread - 1: ");

        Thread thread1 = new Thread(){
            public void run(){
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName()+": "+i);
                    try {
                        Thread.sleep(1000);
                    }catch (Exception exception){
                        exception.printStackTrace();
                    }
                }
            }
        };

        thread1.setName("Thread - 2: ");

        thread.start();
        thread.join();
        thread1.start();
    }
}
