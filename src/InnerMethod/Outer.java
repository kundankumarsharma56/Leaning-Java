package InnerMethod;

public class Outer {
    public void main(String[] args) {
        Inner in = new Inner();
        in.innerMethods();
    }

    class Inner{
        void innerMethods(){
            System.out.println("Hello");
        }
    }
}


/*
What is inner class..?
Creating one class inside another class is call as inner class.
inner classes also called as Nested classes
The class which contains other class is call as Outer class
The class which is declared inside outer class is called as inner class

 */