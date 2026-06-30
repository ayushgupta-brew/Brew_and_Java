package Collections_Framework;

// A Map in Java is a collection that stores key-value pairs, where each key is unique and used to retrieve its corresponding value.

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {

        Map<Integer, String> name = new HashMap<>();  // Integer is key and String is value

        name.put(1 , "Ayush");
        name.put(2 , "Rajesh");
        name.put(3 , "Nisha");

//        System.out.println(name);

        for (int key : name.keySet())  System.out.println(key + " : " + name.get(key));  // keySet() will give all keys
    }
}
