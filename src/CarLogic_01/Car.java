package CarLogic_01;

public class Car {

    private IEngine engine;

//    public Car(IEngine engine){
//        this.engine = engine;           this is
//    }


    // This is seter
    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public void drive(){
        int status = engine.start();

        if (status >= 1){
            System.out.println("Journey Started....");
        }else {
            System.out.println("Engine Trouble");
        }
    }
}
