package CarLogic_01;

public class PetrolEngine implements IEngine{

    @Override
    public int start() {
        System.out.println("Petrol engine Started....");
        return 1;
    }
}
