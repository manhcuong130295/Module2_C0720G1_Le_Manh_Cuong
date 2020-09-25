package _12_java_collection_framework.thuc_hanh.su_dung_hashmap_linkedmap_treemap;

import javafx.beans.binding.MapBinding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedMap = new LinkedHashMap<>(treeMap)
                ;
//        linkedMap.put("Smith", 30);
//        linkedMap.put("Anderson", 31);
//        linkedMap.put("Lewis", 29);
//        linkedMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedMap.get("Lewis"));
    }
}
