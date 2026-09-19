package OOPS_PART_2;

public class AreaCalculator_01 {
    int area(int side){
        return side * side;
    }

    int area(int length, int width){
        return length * width;
    }

    double area(double radius){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator_01 areaCalculator = new AreaCalculator_01();
        System.out.println("Area of Square: "+areaCalculator.area(34));
        System.out.println("Area of Rectangle: "+areaCalculator.area(34,48));
        System.out.println("Area of Circle: "+areaCalculator.area(34.36));
    }
}
