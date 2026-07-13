package Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardInGenerics {

    // Method Generic
    // T represents one specific type.
    // Since Java knows the exact type, we can both READ and WRITE.
    public <T> void printListUsingMethodGeneric(List<T> list, T newElement) {

        // Allowed because Java knows the exact type of the list.
        list.add(newElement);

        System.out.print("Method Generic: ");
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Wildcard Generic
    // ? means "unknown type".
    // Since the exact type is unknown, we should only READ from it.
    public void printListWithoutMethodGeneric(List<?> list) {

        System.out.print("Wildcard Generic: ");
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Not allowed because Java doesn't know the actual type.
        // list.add("ABC");     // Compile-time Error
        // list.add(100);       // Compile-time Error
    }
}

class Main {

    public static void main(String[] args) {

        WildCardInGenerics demo = new WildCardInGenerics();

        // Mutable Integer List
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        // Mutable String List
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");

        // Method Generic (Read + Write)
        demo.printListUsingMethodGeneric(integerList, 4);
        demo.printListUsingMethodGeneric(stringList, "D");

        System.out.println();

        // Wildcard Generic (Read Only)
        demo.printListWithoutMethodGeneric(integerList);
        demo.printListWithoutMethodGeneric(stringList);
    }
}