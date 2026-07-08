package Generics;

/*
 * ===========================================================
 *              BOX WITHOUT GENERICS
 * ===========================================================
 *
 * This Box can store ANY type of object because its field
 * is declared as Object.
 *
 * Since every class in Java inherits from Object,
 * anything can be stored here.
 *
 * Drawback:
 * ----------
 * Whenever we retrieve the value,
 * getValue() returns Object.
 *
 * Therefore, manual casting is required.
 *
 * If we cast to the wrong type,
 * the compiler won't stop us.
 * The program fails only at Runtime.
 */
class Box {

    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

/*
 * ===========================================================
 *              BOX WITH GENERICS
 * ===========================================================
 *
 * T is called a Type Parameter.
 *
 * Instead of using Object,
 * we let the user decide the type when
 * creating the object.
 *
 * Example:
 * GenericBox<Integer>
 * GenericBox<String>
 * GenericBox<Double>
 *
 * Once the type is chosen,
 * the compiler enforces it everywhere.
 *
 * Benefits:
 * ----------
 * ✔ Compile-time type safety
 * ✔ No manual casting
 * ✔ Better readability
 * ✔ Better IDE auto-completion
 */
class GenericBox<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericBoxExample {

    static void main(String[] args) {

        /*
         * ===================================================
         * WITHOUT GENERICS
         * ===================================================
         */

        Box box = new Box();

        // Can store Integer
        box.setValue(1);

        // Also possible:
        // box.setValue("Ayush");
        // box.setValue(10.5);

        /*
         * getValue() returns Object.
         * Hence manual casting is required.
         */
        Integer integer1 = (Integer) box.getValue();

        /*
         * Compiler allows this because
         * Object can be cast to anything.
         *
         * But the actual object is Integer.
         * Hence Runtime ClassCastException.
         */
        // String integer2 = (String) box.getValue();

        System.out.println(integer1 + " -> manual cast output");

        /*
         * ===================================================
         * WITH GENERICS
         * ===================================================
         */

        /*
         * Here T becomes Integer.
         *
         * Internally, the compiler behaves as if
         * every T is replaced with Integer.
         */
        GenericBox<Integer> genericBox = new GenericBox<>();

        // Allowed
        genericBox.setValue(1);

        /*
         * Compile-time Error
         *
         * Compiler knows this box accepts only Integer.
         */
        // genericBox.setValue("String");

        /*
         * No casting required.
         * getValue() directly returns Integer.
         */
        int value = genericBox.getValue();

        System.out.println(value);

        /*
         * We can create another GenericBox
         * with a completely different type.
         */

        GenericBox<String> stringBox = new GenericBox<>();

        stringBox.setValue("Ayush");

        String name = stringBox.getValue();

        System.out.println(name);
    }
}