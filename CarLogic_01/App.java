package CarLogic_01;

public class App {
    public static void main(String[] args) {
//        Car c = new Car(new DieselEngine());
//        c.drive();

        // This is via set
        Car c = new Car();
        c.setEngine(new DieselEngine());
        c.drive();
    }
}
