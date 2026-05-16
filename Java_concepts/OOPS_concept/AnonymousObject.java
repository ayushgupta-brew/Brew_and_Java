package OOPS_concept;

// in anonymous object creation we can directly write new A() to create an object
// if we want to call any method we can use new A().show()
// these anonymous objects cannot be reused

class A{

    public A(){
        System.out.println("In A constructor");
    }

    public void show(){
        System.out.println("in A show");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {

//        A obj = new A();  // object created  using reference variable

//        obj.show();

        new A(); // Anonymous object that don't have a name means any reference variable .

        new A().show(); // using this we can call the methods
    }
}
