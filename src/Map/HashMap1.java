package Map;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMap1 {
    public static void main(String[] args) {

        //////Hien thi ko theo quy luat/////
        Map<String, Integer> hashMap =new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

     ////////// sap xep theo A alpha B
        Map< String, Integer > treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

     ////////// tim value thong qua key    //////
        Map< String, Integer > linkedHashMap = new TreeMap<>();
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }


}
