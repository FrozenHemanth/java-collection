package Runner;

import com.xworkz.set.SnackDTO;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SnackDTORunner {
    public static void main(String[] args) {
    Set<SnackDTO> set = new HashSet<>();
    set.add(new SnackDTO("Aa","salt",150.4,25));
    set.add(new SnackDTO("BINGO","salt",120.5,30));
    set.add(new SnackDTO("BB","salt",150.4,25));
    set.add(new SnackDTO("ANIMALS","salt",150.4,25));
    set.add(new SnackDTO("TEDEMEDAY","hot",155.4,30));
    set.add(new SnackDTO("KURKURE","chilli",150.4,25));
    set.add(new SnackDTO("EGGPUFF","masala",50,25));
    set.forEach(System.out::println);
    set.forEach(hashcode-> System.out.println(hashcode.hashCode()));
    System.out.println("size "+set.size());
        System.out.println("contains "+set.contains(new SnackDTO("LAYS","salt",150.4,25)));
        System.out.println("----------------------------------------");
        Set<SnackDTO> treeSet = new TreeSet<>();
        treeSet.add(new SnackDTO("Aa","salt",150.4,25));
        treeSet.add(new SnackDTO("BINGO","salt",120.5,30));
        treeSet.add(new SnackDTO("BB","salt",150.4,25));
        treeSet.add(new SnackDTO("ANIMALS","salt",150.4,25));
        treeSet.forEach(HC-> System.out.println(HC.hashCode()));
        treeSet.forEach(System.out::println);
        System.out.println("size "+treeSet.size());
        System.out.println("contains "+treeSet.contains(new SnackDTO("LAYS","salt",150.4,25)));
        System.out.println("----------------------------------------");
        SnackDTO snack = new SnackDTO("EGGPUFF","masala",50,25);
        set.remove(snack);
        SnackDTO snack1 = new SnackDTO("KURKURE","chilli",150.4,25);
        set.remove(snack1);
        System.out.println("size "+set.size());
        System.out.println("contains "+set.contains(snack));

        System.out.println("size after clear "+set.size());
        set.clear();
        System.out.println("isEmpty "+set.isEmpty());
        System.out.println("size after clear "+set.size());

        Set<SnackDTO> snackSet = new HashSet<>(5,0.5f);
        snackSet.add(new SnackDTO("Aa","salt",150.4,25));
        snackSet.add(new SnackDTO("BINGO","salt",120.5,30));
        snackSet.add(new SnackDTO("BB","salt",150.4,25));
        snackSet.add(new SnackDTO("ANIMALS","salt",150.4,25));



        System.out.println("SIR I WILL PERFORM " );
        System.out.println(" FURTHER PROBABLITIES  LATER TODAY ");
        System.out.println("i HAD TO TRAVELL somewhere with my family THANK YOU :)");
        System.out.println("----------------i will record the class and see it later------------------------");



        long count = snackSet.stream().filter(snackDTO -> snackDTO.getFlavor().equals("salt")).count();
        System.out.println("Count of snacks with flavor 'salt' " + count);

        double totalWeight = snackSet.stream().mapToDouble(SnackDTO::getWeight).sum();
        System.out.println("Total weight of all snacks " + totalWeight);

        List<SnackDTO> filteredSnacks = snackSet.stream().filter(snackDTO -> snackDTO.getPrice() < 30).collect(Collectors.toList());
        System.out.println("Filtered snacks with price below 30 " + filteredSnacks);

    }
}
