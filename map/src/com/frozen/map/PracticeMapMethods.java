package com.frozen.map;

import lombok.Value;

import java.security.Key;
import java.util.*;

public class PracticeMapMethods {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();

        map.put("Jerry", 10);
        map.put("Tom", 20);
        map.put("Spike", 30);
        map.put("Tyke", 40);
        map.put("Joe", 50);
        map.put("Jerry", 60);
        System.out.println(map);

        System.out.println("size of map is "+map.size());

        System.out.println("get to get value of key");
        System.out.println(map.get("Tyke1"));

        System.out.println("containskey to check if key is present or not");
        System.out.println(map.containsKey("Tyke1"));

        System.out.println("putIfAbsent to add key value pair if key is not present");
        map.putIfAbsent("Tyke1", 70);
        System.out.println(map);

        System.out.println("compute to update value of key");
        map.compute("Tyke1", (k,v)->v+1+2);
        System.out.println(map);

        System.out.println("computeIfAbsent to add key value pair if key is not present");
        map.computeIfAbsent("Tyke1", (k)->100);
        System.out.println(map);

        System.out.println("replace to update value of key");
        map.replace("Tyke1", 80);
        System.out.println(map);

        System.out.println("remove to remove key value pair");
        map.remove("Tyke1");
        System.out.println(map);

        System.out.println("entrySet to get set of key value pairs");
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println(entrySet);

        System.out.println("keySet to get set of keys");
        System.out.println(map.keySet());

        System.out.println("values to get set of values");
        System.out.println(map.values());

        System.out.println("merge to update value of key");
        map.merge("Joe", 40, (v1,v2)->v1+v2);
        System.out.println(map);

        System.out.println("merge to add key value pair if key is not present");
        map.merge("Tyke", 40, (v1,v2)->v1+v2);
        System.out.println(map);

        System.out.println("merge to update value of key");
        map.merge("Akasha swami", 40, (v1,v2)->v1+v2);
        System.out.println(map);

        System.out.println("merge to add key value___ pair if key is not present");
        map.merge("Tyke", 40, (v1,v2)->v1+v2);
        System.out.println(map);

        System.out.println("computeIfAbsent to add key value pair if key is not present");
        map.computeIfAbsent("Krishna",k->60);
        System.out.println(map);

        System.out.println("computeIfPresent to update value of key");
        map.computeIfPresent("Akasha swami",(k,v)->v+10);
        System.out.println(map);

        System.out.println("replace to update value of key");
        map.replace("Akasha swami", 9);
        System.out.println(map);

        System.out.println("compute to update value of key");
        map.compute("Akasha swami", (k,v)->v+10);
        System.out.println(map);

        System.out.println("putIfAbsent to add key value pair if key is not present");
        map.putIfAbsent("Elon musk", 60);
        System.out.println(map);

        System.out.println("get : to get value of key");
        System.out.println(map.get("Elon musk"));

        System.out.println("getOrDefault : to get value of key if key is not present");
        System.out.println(map.getOrDefault("raju ", 70));
        System.out.println(map);

        System.out.println("entrySet to get set of key value pairs");
        System.out.println(map.entrySet());

        System.out.println("containsvalue to check if value is present or not");

        System.out.println(map.containsValue(8));

        System.out.println(map);


        Set<String> keySet = map.keySet();

        keySet.forEach(System.out::println);

        map.forEach((k,v)->System.out.println(k+" "+v));

        map.values().forEach(System.out::println);
















    }
}
