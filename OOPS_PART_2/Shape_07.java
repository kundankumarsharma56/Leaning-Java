package OOPS_PART_2;

public class Shape_07 {

    public double calculateArea(){
        return 0.0;
    }

    public static void main(String[] args) {
        Shape_07 sh = new Circle();
        System.out.println("Area of circle: "+sh.calculateArea());

        Shape_07 sh1 = new Rectangle();
        System.out.println("Area of ReactAngle: "+sh1.calculateArea());

        Shape_07 sh2 = new Square();
        System.out.println("Area of Square: "+sh2.calculateArea());
    }
}
class  Circle extends  Shape_07{
    @Override
    public double calculateArea() {
        double radius = 35;
        return Math.PI * radius * radius ;
    }
}

class Rectangle extends Shape_07{
    @Override
    public double calculateArea() {
        double length = 95;
        double width = 15;
        return length * width;
    }
}

class Square extends Shape_07{
    @Override
    public double calculateArea() {
        int sideLength = 7;
        return sideLength * sideLength;
    }
}
