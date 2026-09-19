package MultiThreading.User_defined_Thread;

import java.util.concurrent.*;

public class Callable_Interface implements Callable {
    public  Object call() throws Exception{
        System.out.println("Call Method started...");
        return "success";
    }

    @SuppressWarnings("Unchecked")
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable_Interface callable = new Callable_Interface();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 15; i++) {
            Future submit = executorService.submit(callable);
            System.out.println(submit.get().toString());
        }
        executorService.shutdown();
    }
}
