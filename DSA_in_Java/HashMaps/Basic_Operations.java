package HashMaps;

// All Important Operations ->
/*      map.put(key, value);
        map.get(key);
        map.remove(key);
        map.containsKey(key);
        map.containsValue(value);
        map.replace(key, value);
        map.size();
        map.isEmpty();
        map.clear();

        map.keySet();
        map.values();
        map.entrySet();

        map.putIfAbsent(key, value);
        map.getOrDefault(key, defaultValue);*/

import java.util.HashMap;
import java.util.Map;

public class Basic_Operations {

    static void main(String[] args){
        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 1. put() -> Add key-value pair
        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "React");

        System.out.println("Map: " + map);

        // 2. get() -> Get value using key
        System.out.println("Key 2: " + map.get(2));

        // 3. put() with same key -> Overwrites old value
        map.put(1, "Spring Boot");
        System.out.println("After update: " + map);

        // 4. containsKey() -> Check key exists or not
        System.out.println(map.containsKey(3));

        // 5. containsValue() -> Check value exists or not
        System.out.println(map.containsValue("React"));

        // 6. remove() -> Remove entry by key
        map.remove(2);
        System.out.println("After remove: " + map);

        // 7. size() -> Number of entries
        System.out.println("Size: " + map.size());

        // 8. Traverse HashMap (Most Important)
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        // 9. clear() -> Remove everything
        map.clear();

        // 10. isEmpty() -> Check map is empty
        System.out.println(map.isEmpty());
    }
}
