/* Thread.join(); And Thread.yield(); both are opposite

    Thread.join(); Means finish one first then start next
    Thread.yield(); Means work parlay
 */

package MultiThreading.NormalThread_IncludingJoinEtc;

public class YieldMethod {
    public static void main(String[] args) throws Exception {

        // 1st Thread
        Thread thread = new Thread(){
            public void run(){
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName()+": "+i);
                    try {
                        Thread.sleep(1000);
                        Thread.yield();
                    }catch (Exception exception){
                        exception.printStackTrace();
                    }
                }
            }
        };
        thread.setName("Thread - 1: ");


        //  2nd Thread
        Thread thread1 = new Thread(){
            public void run(){
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName()+": "+i);
                    try {
                        Thread.sleep(1000);
                        Thread.yield();
                    }catch (Exception exception){
                        exception.printStackTrace();
                    }
                }
            }
        };

        thread1.setName("Thread - 2: ");

        thread.start();
        thread1.start();
    }
}
