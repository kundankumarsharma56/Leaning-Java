package Java_8features;

interface Vehicle {
    public void start();
    public default void clean(){
        System.out.println("Cleaning Completed......");
    }
}

public class Car implements Vehicle {

    public void start(){
        System.out.println("Start the car");
    }


    public static  void main(String[] args){
        Car c = new Car();
        c.start();
        c.clean();
    }
}
