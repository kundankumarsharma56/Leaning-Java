package OOPS_PART_1;

public class Rectangle_03 {
    double length;
    double width;

    double calculateArea(){
        return length * width;
    }
    double calculatePerimeter(){
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle_03 area = new Rectangle_03();
        area.length = 45.36;
        area.width = 97.48;
        System.out.println("Area of Rectangle: " + area.calculateArea());

        Rectangle_03 perimeter = new Rectangle_03();
        perimeter.length = 94.25;
        perimeter.width = 36.45;
        System.out.println("Perimeter of rectangle: "+perimeter.calculatePerimeter());
    }
}
