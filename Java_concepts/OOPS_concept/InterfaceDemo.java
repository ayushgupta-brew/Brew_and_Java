package OOPS_concept;

// Interface is an alternative of abstract

// In interface, we can declare variables but the variables are final and static for default because interface does not have any memory in heap and stack .

// we can implement multiple interface

// we can extend the interface means inheritance concept in interface . Ex -> interface b extends a (valid syntax)

interface com1{
    void show();
    void config();
    int number = 21;
}

interface com2{
    void run();
}

class C1 implements com1,com2{   // multiple interface

    public void show() {
        System.out.println("In show");
    }

    public void config() {
        System.out.println("In config");
    }

    public void run() {
        System.out.println("In run");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        com1 obj = new C1();
        com2 obj1 = new C1();
        int n = com1.number;

        System.out.println(n);

        obj.config();
        obj.show();
        obj1.run();
    }
}
