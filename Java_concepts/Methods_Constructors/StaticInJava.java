package Methods_Constructors;

class Static_Example{
    static String name;
    int rollNo;

    static {  // Static block
        name = "Rajesh";
        System.out.println("In Static Block");
    }

//    Static_Example(){ // non-parameterised constructor same as class name
//        rollNo = 0;
//        System.out.println("In constructor Block");
//    }

    public void show(){
        System.out.println(name + " : " + rollNo);
    }

    public static void show1(){
        System.out.println("In static method");
    }
}

public class StaticInJava {
    public static void main(String[] args) throws ClassNotFoundException {

//        Static_Example s1 = new Static_Example();
//        s1.rollNo = 10;
//
//        Static_Example s2 = new Static_Example();
//        s2.rollNo = 20;
//
//        s1.show();
//        s2.show();

//        Class.forName("Methods_Constructors.Static_Example"); // loading a class only

        Static_Example.show1();
    }
}
