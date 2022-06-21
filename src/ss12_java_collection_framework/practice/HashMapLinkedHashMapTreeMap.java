package ss12_java_collection_framework.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapLinkedHashMapTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("tri",30);
        hashMap.put("anh",35);
        hashMap.put("tam",40);
        hashMap.put("trung",19);
        hashMap.put("tai",20);
        System.out.println(hashMap+"\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap + "\n");
    }
}
