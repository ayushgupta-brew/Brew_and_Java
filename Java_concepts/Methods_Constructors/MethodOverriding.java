package Methods_Constructors;

// Method Overriding means same two methods names as well as the arguments .

class A2{
    public void show(){
        System.out.println("In A show");
    }

    public void config(){
        System.out.println("In A config");
    }
}

class B2 extends A2{
    public void show(){
        System.out.println("In B show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        B2 obj = new B2();

        obj.show();
        obj.config();
    }
}
