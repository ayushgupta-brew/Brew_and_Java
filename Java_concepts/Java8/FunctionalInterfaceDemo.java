package Java8;

/*
    A functional interface has exactly one abstract method.
    That one method is the "target" for the lambda expression.
*/
@FunctionalInterface
interface Ayush {
    void show(int i);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        /*
            Old way: Anonymous class
            We are manually creating an object and writing the method body.
        */
        Ayush obj1 = new Ayush() {
            @Override
            public void show(int i) {
                System.out.println("Anonymous class: " + i);
            }
        };

        /*
            New way: Lambda expression
            This is the same thing, but shorter.

            Think of it like this:
            show(int i)  --->  System.out.println("Lambda: " + i)

            Java already knows:
            - interface name: Ayush
            - method name: show
            - parameter type: int
        */
        Ayush obj2 = (i) -> {
            System.out.println("Lambda expression: " + i);
        };

        /*
            If there is only one parameter, parentheses can be removed.
        */
        Ayush obj3 = i -> System.out.println("Short lambda: " + i);

        /*
            Calling the method
        */
        obj1.show(5);
        obj2.show(10);
        obj3.show(15);
    }
}