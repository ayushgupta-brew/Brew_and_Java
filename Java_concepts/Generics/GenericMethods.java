package Generics;

public class Bounded_Type_Parameters {
    static void main() {
        Integer[] array = {1,2,3,4,5};
        printArray(array);
    }
    public static <T> void method (T value){
        System.out.println(value);
    }
    public static <T> void printArray (T[] array){
        for(T i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}