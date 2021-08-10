package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1{
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(15, "Ruslan");
        map1.put(2, "Ira");
        map1.put(5, "Artem");
        map1.put(4, "Natasha");
        map1.put(3, "Katia");
        map1.put(8, "Katia");
        System.out.println(map1);
        map1.putIfAbsent(5, "Roman");
        System.out.println(map1);
        System.out.println(map1.get(10));
        map1.remove(4);
        System.out.println(map1);
        System.out.println(map1.containsValue("Ruslan"));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        Map<Integer, String> map2 = new HashMap<>();
        Map<Integer, String> map3 = new HashMap<>();
        map2.put(15, "Ruslan");
        map2.put(2, "Ira");
        map3.put(2, "Ira");
        map3.put(15, "Ruslan");
        System.out.println(map2.equals(map3));
        System.out.println(map3);
       for (Map.Entry<Integer,String> map:map3.entrySet()){
           System.out.println(map.getKey()+":"+map.getValue());
       }

    }
}
