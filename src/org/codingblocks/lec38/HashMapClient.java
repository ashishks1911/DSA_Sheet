package org.codingblocks.lec38;

public class HashMapClient {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Raj", 87);
        map.put("Ankit", 57);
        map.put("Kunal", 78);
        map.put("Amit", 89);
        map.put("Mohan", 75);
        map.put("Shiva", 56);
        map.put("Pooja", 78);
        map.put("Hardik", 58);
        map.put("Ankit", 67);
        map.put("Ankita", 67);
        System.out.println(map.get("Ankit"));
        System.out.println(map);
    }
}
