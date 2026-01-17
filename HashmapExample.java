package week15;

import java.util.*;

class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // 1️⃣ Insert Data
        map.put(1, "Zainab");
        map.put(2, "Ayesha");

        // 2️⃣ Access Data
        System.out.println("Value for key 1: " + map.get(1));

        // 3️⃣ Remove Data
        map.remove(2);

        // 4️⃣ Check Key
        System.out.println("Contains key 1? " + map.containsKey(1));

        // 5️⃣ Size & Empty Check
        System.out.println("Size of map: " + map.size());
        System.out.println("Is map empty? " + map.isEmpty());

        // 6️⃣ Iterating using keySet()
        System.out.println("\nIterating using keySet():");
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // 7️⃣ Iterating using values()
        System.out.println("\nIterating using values():");
        for (String value : map.values()) {
            System.out.println(value);
        }

        // 8️⃣ Iterating using entrySet()
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}

