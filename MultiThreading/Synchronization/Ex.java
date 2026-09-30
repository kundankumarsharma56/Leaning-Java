package MultiThreading.Synchronization;

public class Ex implements Runnable{

    public synchronized void printNum(){
        for(int i = 1; i <= 10; i++){
            System.out.println(Thread.currentThread().getName()+": "+i);

            try {
                Thread.sleep(1000); // wait for 1 sec
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public  void run(){
        printNum();
    }

    public static void main(String[] args) {
        Ex ex = new Ex();
        Thread t1 = new Thread(ex);
        t1.start();

        Thread t2 = new Thread(ex);
        t2.start();
    }
}

