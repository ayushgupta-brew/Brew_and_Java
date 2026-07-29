package Java8;

/*
    Anonymous Inner Class

    - A class without a name.
    - Used when implementation is needed only once.
    - Avoids creating a separate class.
*/

interface Animal {
    void sound();
}

public class AnonymousInnerClass {

    public static void main(String[] args) {

        /*
            Creates an anonymous class that
            implements the Animal interface.
        */
        Animal dog = new Animal() {

            // Implementing the interface method
            @Override
            public void sound() {
                System.out.println("Dog says: Bark Bark");
            }
        };

        /*
            Another anonymous class with
            a different implementation.
        */
        Animal cat = new Animal() {

            @Override
            public void sound() {
                System.out.println("Cat says: Meow");
            }
        };

        // Calling the methods
        dog.sound();
        cat.sound();
    }
}