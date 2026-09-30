package Generics;

public class Demo <T1>{
    T1 obj1;

    void Methods(T1 obj1){

       this.obj1 = obj1;
    }

    T1 get(){
        return obj1;
    }
    public static void main(String[] args) {
        Demo<Integer> D1 = new Demo<>();
        D1.Methods(101);
        System.out.println(D1.get());

        Demo<String> D2 = new Demo<>();
        D2.Methods("HelloSir");
        System.out.println(D2.get());
    }
}
