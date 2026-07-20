package runner;

import dto.CheifMinisterDTO;
import dto.StateDTO;

import java.util.HashMap;
import java.util.Map;

public class CMandStateRunner {
    public static void main(String[] args) {

        Map<StateDTO, CheifMinisterDTO> map=new HashMap<>();
        map.put(new StateDTO("Karnataka", "Bengaluru"), new CheifMinisterDTO("Prathibha", "BJP"));
        map.put(new StateDTO("Maharashtra", "Mumbai"), new CheifMinisterDTO("Prithviraj Chavan", "BJP"));
        map.put(new StateDTO("Madhya Pradesh", "Bhopal"), new CheifMinisterDTO("Shivraj Singh Chouhan", "BJP"));
        map.put(new StateDTO("Gujarat", "Gandhinagar"), new CheifMinisterDTO("Anandi", "BJP"));
        map.put(new StateDTO("Odisha", "Bhubaneswar"), new CheifMinisterDTO("Naveen Patnaik", "BJD"));

       map.forEach((k,v)->System.out.println(k+" "+v));

       map.values().forEach(System.out::println);

       map.keySet().forEach(System.out::println);
    }
}
