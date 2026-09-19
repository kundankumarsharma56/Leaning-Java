package OOPS_PART_2;

public class Animal_04 {
    String name;

    void eat(){
        System.out.println("Animal Can eat");
    }
    void sleep(){
        System.out.println("Animal sleep");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
//        dog.eat();
//        dog.sleep();
        dog.bark();

        Cat cat = new Cat();
//        cat.eat();
//        cat.sleep();
        cat.meow();
    }
}

class  Dog extends Animal_04{
    void bark(){
        System.out.println("Bho Bho");
    }
}

class  Cat extends Animal_04{
    void meow(){
        System.out.println("Meow");
    }
}


