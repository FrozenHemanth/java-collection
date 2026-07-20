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

        map.computeIfAbsent(new HeroDTO("Akash", 1000000.0),
                k->new MovieDTO("Jawan", "Rajkumar Hirani"));
        System.out.println("-----------------------------------");
        map.forEach((k,v)->System.out.println(k+" "+v));

 
    }
}
