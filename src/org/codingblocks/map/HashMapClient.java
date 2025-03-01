package org.codingblocks.map;

public class HashMapClient {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raj", 87);
        map.put("Ankit", 57);
        map.put("Kunal", 78);
        map.put("Amit", 89);
        map.put("Ankita", 75);
        map.put("Shiva", 56);
        map.put("Pooja", 78);
        map.put("Ankit", 67);
        map.put("Ankita", 67);
        System.out.println(map.get("Ankita"));
        System.out.println(map);

    }
}
