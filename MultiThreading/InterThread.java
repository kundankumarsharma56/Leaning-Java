package MultiThreading;

public class InterThread {
    int amount = 10000;

    synchronized void withdraw(int amount){
        System.out.println("Going to withdraw...");

        if(this.amount < amount){
            System.out.println("Less Bank balance: "+amount);

            try {
                wait();
            } catch (Exception e) {
//                e.printStackTrace();
            }
        }
        this.amount -= amount;
        System.out.println("Withdraw completed...");
    }

    synchronized void deposit(int amount){
        System.out.println("Going to deposit...");
        this.amount += amount;
        System.out.println("Deposit completed..."+amount);
        notify();
    }

    public static void main(String[] args) {
        final  InterThread interThread = new InterThread();

        new Thread(){
            public  void run(){
                interThread.withdraw(15000);
            }
        }.start();

        try{
            Thread.sleep(20000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        new Thread(){
            public void run(){
                interThread.deposit(100000);
            }
        }.start();
    }
}
