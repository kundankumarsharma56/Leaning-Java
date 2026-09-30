package OOPS_PART_1;

public class Constructor_Overloading_05 {
    int width;
    int length;
    int  height;

    public Constructor_Overloading_05() {

    }

    public Constructor_Overloading_05(int length) {
        this.length = length;
    }

    public Constructor_Overloading_05(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    double volumeOfBox(){
        return length*width*height;
    }

    public static void main(String[] args) {
        Constructor_Overloading_05 nonparameter = new Constructor_Overloading_05();
        nonparameter.length = 45;
        nonparameter.width = 75;
        nonparameter.height = 63;

        System.out.println("Non Parameter: "+nonparameter.volumeOfBox());

        Constructor_Overloading_05 singleParameter = new Constructor_Overloading_05(34);
        singleParameter.width = 96;
        singleParameter.height = 20;
        System.out.println("Single parameter: "+singleParameter.volumeOfBox());

        Constructor_Overloading_05 parameter = new Constructor_Overloading_05(35,69,12);
        System.out.println("Parameter: "+parameter.volumeOfBox());
    }
}
