package OOPS_concept;

// One method or function in interface is called functional interface or SAM (Single Abstract Method)

// we use -> this to show lambda expression

// we can directly write variable i in lambda expression without any () .

@FunctionalInterface
interface Ayush{
    void show(int i);
}

//class a3 implements Ayush{
//    @Override
//    public void show() {
//        System.out.println("In show");
//    }
//}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        // Using Anonymous Class
        Ayush obj1 = new Ayush(){
            @Override
            public void show(int i) {
                System.out.println("In anonymous show " + i);
            }
        };

        // Using Lambda function
        Ayush obj = (i) -> System.out.println("In lambda show " + i);
        Ayush obj2 = i -> System.out.println("In lambda show " + i);

        obj1.show(5);
        obj.show(5);

    }
}
