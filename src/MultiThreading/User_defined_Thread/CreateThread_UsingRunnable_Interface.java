package MultiThreading.User_defined_Thread;

public class CreateThread_UsingRunnable_Interface implements Runnable{

    public  void run(){
        System.out.println("Run() Method Called...");
    }

    public static void main(String[] args) {
        CreateThread_UsingRunnable_Interface cturi = new CreateThread_UsingRunnable_Interface();
        Thread t = new Thread(cturi); // cturi is reference which is user defined
        t.start();
    }
}


  /* Q.) What is the diff between extending Thread class and Implementing Runnable interface,
       Which is recommended?

    Ans. Extending => if we extend properties from Thread class we can't extend properties
         from any other class because java doesn't support multiple inheritance

         Interface =>   If we implement Runnable interface then in future we can extend
         properties from any class based on requirement. (Our gate for interface)

         Note : Implementing Runnable interface is always recommended.
   */