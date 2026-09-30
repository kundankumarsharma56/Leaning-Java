package OOPS_PART_2;

public class Vehicle_05 {
    String brand;
    int speed;

    public void start(){
        System.out.println("Engin Started");
    }

    public void Displaydetails(){
        System.out.println("Vehicle Brand: "+brand);
        System.out.println("Vehicle speed: "+speed);
    }

    public static void main(String[] args) {

        System.out.println("============Car==============");
        Car car = new Car();
        car.brand = "maruti Suzuki";
        car.speed = 120;
        car.numberOfDoor = 4;
        car.Displaydetails();
        System.out.println("Number of door: "+car.numberOfDoor);
        car.start();


        System.out.println("============Bike==============");

        Bike bike = new Bike();
        bike.brand = "Splendor";
        bike.speed = 90;
        bike.hasGear = "Yes with 4 gear";
        bike.Displaydetails();
        System.out.println("Number of door: "+bike.hasGear);
        bike.start();
    }
}

class Car extends Vehicle_05{
    int numberOfDoor;
}

class  Bike extends Vehicle_05{
    String hasGear;
}
