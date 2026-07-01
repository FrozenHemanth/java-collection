package Runner;

import dto.WeaponsDTO;

import java.util.*;

public class WeaponsRunner {
    public static void main(String[] args) {
        List<WeaponsDTO> weapons = new ArrayList<>();
        WeaponsDTO weaponsDTO1 = new WeaponsDTO(
            "AKM", 7.77, "highe", "colserange", "assault", "steel", 30, false, true
        );
        WeaponsDTO weaponsDTO2 = new WeaponsDTO(
            "M4A1", 17, "medium", "mediumrange", "assault", "aluminum", 30, false, true
        );
        WeaponsDTO weaponsDTO3 = new WeaponsDTO(
            "Glock", 17, "low", "closerange", "handgun", "aluminum", 15, true, true
        );
        WeaponsDTO weaponsDTO4 = new WeaponsDTO(
            "Desert eagle", 1, "high", "closerange", "handgun", "steel", 7, true, false
        );
        WeaponsDTO weaponsDTO5 = new WeaponsDTO(
            "M16A4", 30, "high", "mediumrange", "assault", "aluminum", 30, false, true
        );
        WeaponsDTO weaponsDTO6 = new WeaponsDTO(
            "M249", 7.77, "high", "longrange", "support", "steel", 100, true, true
        );
        WeaponsDTO weaponsDTO7 = new WeaponsDTO(
            "AK47", 30, "medium", "mediumrange", "assault", "steel", 30, false, true
        );
        WeaponsDTO weaponsDTO8 = new WeaponsDTO(
            "KAR19", 7.77, "high", "longrange", "snipper", "aluminum", 50, true, true
        );
        WeaponsDTO weaponsDTO9 = new WeaponsDTO(
            "MP5", 30, "medium", "closerange", "submachine", "aluminum", 30, true, true
        );
        WeaponsDTO weaponsDTO10 = new WeaponsDTO(
            "Glock19", 17, "low", "closerange", "handgun", "aluminum", 15, true, true
        );
        WeaponsDTO weaponsDTO11 = new WeaponsDTO(
            "flaregun", 10, "no damage", "longrange", "snipper", "plastic", 1, false, false
        );

        weapons.add(weaponsDTO1);
        weapons.add(weaponsDTO2);
        weapons.add(weaponsDTO3);
        weapons.add(weaponsDTO4);
        weapons.add(weaponsDTO5);
        weapons.add(weaponsDTO6);
        weapons.add(weaponsDTO7);
        weapons.add(weaponsDTO8);
        weapons.add(weaponsDTO9);
        weapons.add(weaponsDTO10);
        weapons.add(weaponsDTO11);
        weapons.forEach(System.out::println);
        System.out.println("size = " + weapons.size());
        boolean contains = weapons.contains(weaponsDTO1);
        System.out.println("contains = " + contains);

        if (contains) {
            weapons.remove(weaponsDTO1);
        }
        System.out.println("after remove = " + weapons.size());
        weapons.add(new WeaponsDTO(
            "Mossin", 7.77, "highe", "longrange", "snipper", "steel", 30, false, true
        ));
        System.out.println("after add one more weapon size = " + weapons.size());
        // weapons.removeAll(weapons);
        // System.out.println("after remove all = " + weapons.size());
        Iterator<WeaponsDTO> listIterator = weapons.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("after iterator = " + weapons.size());
        WeaponsDTO myweapon = new WeaponsDTO(
            "flaregun", 10, "no damage", "longrange", "snipper", "plastic", 1, false, false
        );
        boolean contains1 = weapons.contains(myweapon);
        System.out.println("contains = " + contains1);
        System.out.println("myweapon is matched with one of weapons " + contains1);
        weapons.addAll(weapons);
        System.out.println("after add all = " + weapons.size());
        List<WeaponsDTO> listToBeRemoved = new ArrayList<>();
        listToBeRemoved.add(weaponsDTO1);
        listToBeRemoved.add(weaponsDTO2);
        weapons.removeAll(listToBeRemoved);
        System.out.println("after remove all = " + weapons.size());
      /*  boolean containsALL = weapons.containsAll(listToBeRemoved);
        System.out.println("contains all = " + containsALL);
        if (containsALL) {
            weapons.removeAll(listToBeRemoved);
        }*/
   System.out.println("after remove all = " + weapons.size());
  //weapons.retainAll(listToBeRemoved);
   //System.out.println("after retain all = " + weapons.size());
//boolean retainAll = weapons.retainAll(listToBeRemoved);
 /* if(retainAll)
  {
      weapons.removeAll(listToBeRemoved);
  }
  System.out.println("after retain all = " + weapons.size());
   */
        System.out.println("after retain all = " + weapons.size());

        ListIterator<WeaponsDTO> listIterator1 = weapons.listIterator();
    while(listIterator1.hasNext())
    {
        System.out.println(listIterator1.next());
    }
    System.out.println("after list iterator = " + weapons.size());
    weapons.add(1,new WeaponsDTO("shotgun",10,"high","closerange","assault","steel",12,false,false));
        System.out.println("after adding shotgun no of weapons = " + weapons.size());

        System.out.println(weapons.getFirst());
        System.out.println(weapons.getLast());
        System.out.println(weapons.get(0));
        System.out.println(weapons.get(10));
        weapons.set(0, new WeaponsDTO("flaregun", 10, "no damage", "longrange", "snipper", "plastic", 1, false, false));
        //System.out.println(weapons.getFirst());
        weapons.remove(20);
        System.out.println(weapons);
        System.out.println(weapons.size());
   weapons.listIterator(0);
        System.out.println(weapons.listIterator(0).next());
        System.out.println(weapons.listIterator(11).previous());
        System.out.println(weapons.listIterator(11).previousIndex());
        System.out.println(weapons.listIterator(11).nextIndex());
        weapons.subList(5,7);
        System.out.println(weapons.subList(5,7));
        weapons.sort(Comparator.comparing(WeaponsDTO::getName));
        System.out.println(weapons);
    }
}
