package Generics;

// Parent class
class Animal {

    // Common behavior of every animal
    public String eat() {
        return "Animal is eating";
    }
}

// Interface representing running capability
interface AnimalRunnable {

    void run();
}

// Dog inherits Animal and implements AnimalRunnable
class Dog extends Animal implements AnimalRunnable {

    @Override
    public String eat() {
        return super.eat();
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    // Dog-specific behavior
    public String bark() {
        return "Dog is barking";
    }
}

// Generic class with multiple bounds
class AnimalBox<T extends Animal & AnimalRunnable> {

    // Stores an object of type T
    private final T value;

    AnimalBox(T value) {
        this.value = value;
    }

    public void show() {

        // Allowed because T extends Animal
        System.out.println(value.eat());

        // Allowed because T implements AnimalRunnable
        value.run();
    }
}

public class BoundedGenericExample {

    public static void main(String[] args) {

        // Create a Dog object
        Dog dog = new Dog();

        // Dog satisfies both bounds
        AnimalBox<Dog> dogBox = new AnimalBox<>(dog);

        // Dog's own method
        System.out.println(dog.bark());

        // Methods available because of bounded generic
        dogBox.show();
    }
}