package Methods_Constructors;

// give output in A1 and B1 because even if we create a SubClass object it will call the constructor of the subclass as well as the Parent class .

// we have a super method in every constructor by default

// Every class in java extends Object Class

// This method calls the constructor of the same class

class A1{
    public A1(){

        super();
        System.out.println("In A1");
    }
    public A1(int n){

        super();
        System.out.println("In A1 int");
    }
}

class B1 extends A1{
    public B1(){

        super();
        System.out.println("In B1");
    }

    public B1(int n){

//        super(n); // explicitly implemented
        this();
        System.out.println("In B1 int");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {

        B1 obj = new B1(5);
    }
}
