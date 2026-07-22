package runner;

import dto.HeroDTO;
import dto.MovieDTO;

import java.util.HashMap;
import java.util.Map;

public class MovieRunner {
    public static void main(String[] args) {
        Map<HeroDTO, MovieDTO> map=new HashMap<>();

        map.put(new HeroDTO("Salman", 1000000.0), new MovieDTO("Jawan", "Rajkumar Hirani"));
        map.put(new HeroDTO("Shahrukh", 2000000.0), new MovieDTO("Kuch Kuch Kaisi", "Rajkumar Hirani"));
        map.put(new HeroDTO("Hrithik", 3000000.0), new MovieDTO("Kuch Kuch Kaisi", "Rajkumar Hirani"));
        map.put(new HeroDTO("Salman", 4000000.0), new MovieDTO("Jawan", "Rajkumar Hirani"));
        map.put(new HeroDTO("Salman", 4000000.0), new MovieDTO("Jawan", "Rajkumar Hirani"));

        map.forEach((k,v)->System.out.println(k+" "+v));
        System.out.println("-----------------------------------");
        map.keySet().forEach(k->System.out.println(k+" "+map.get(k)));

        System.out.println("-----------------------------------");
        map.values().forEach(v->System.out.println(v));

        System.out.println("-----------------------------------");
        System.out.println(map.values());

        System.out.println("-----------------------------------");
        map.entrySet().forEach(e->System.out.println(e));

        System.out.println("-----------------------------------");
        System.out.println("computeIfAbsent to add key value pair if key is not present");
        map.computeIfAbsent(new HeroDTO("Akash", 1000000.0),
                k->new MovieDTO("Jawan", "Rajkumar Hirani"));
        System.out.println("-----------------------------------");
        map.forEach((k,v)->System.out.println(k+" "+v));

        System.out.println("-----------------------------------");
        System.out.println("computeIfPresent to update value of key");
        map.computeIfPresent(new HeroDTO("Salman", 4000000.0),
                (k,v)->new MovieDTO("bajarangi", "prashanth neel"));
        map.forEach((k,v)->System.out.println(k+" "+v));

        System.out.println("-----------------------------------");
        System.out.println("replace to update value of key");
        map.replace(new HeroDTO("Salman", 1000000.0), new MovieDTO("jawavan", " Rishab shetty"));
        map.forEach((k,v)->System.out.println(k+" "+v));

        System.out.println("containsKey to check if key is present or not");
        System.out.println(map.containsKey(new HeroDTO("Salman", 1000000.0)));

        System.out.println("containsValue to check if value is present or not");
        System.out.println(map.containsValue(new MovieDTO("jawavan", " Rishab shetty")));

        System.out.println("merge to update value of key");
        map.merge(new HeroDTO("Salman", 1000000.0), new MovieDTO("Jawan", "Rajkumar Hirani"), (v1,v2)->v1);
        map.forEach((k,v)->System.out.println(k+" "+v));

        System.out.println("-----------------------------------");
        map.forEach((k,v)->System.out.println(k+" "+v));

        System.out.println("-----------------------------------");
        System.out.println("computeIfPresent to update value of key  if key is present");
        map.computeIfPresent(new HeroDTO("Hrithik", 3000000.0), (k,v)->new MovieDTO("DHOOM3", " Ajay Devgn"));
        map.forEach((k,v)->System.out.println(k+" "+v));

        System.out.println("-----------------------------------");
        System.out.println("computeIfAbsent to add key value pair if key is not present");
        map.computeIfAbsent(new HeroDTO("Akash", 1000000.0),
                k->new MovieDTO("NONDAMANASUU", "Priya"));
        map.forEach((k,v)->System.out.println(k+" "+v));

        System.out.println("replace to update value of key if key is present");
        map.replace(new HeroDTO("Akash", 1000000.0), new MovieDTO("NONDAMANASUU", "Priya"));
        map.forEach((k,v)->System.out.println(k+" "+v));

        System.out.println("remove to remove key value pair");
        map.remove(new HeroDTO("Akash", 1000000.0));
        map.forEach((k,v)-> System.out.println(k+" "+v));

    }
}
