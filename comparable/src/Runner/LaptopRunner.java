package Runner;

import dto.LaptopDTO;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LaptopRunner {
    public static void main(String[] args) {
        LaptopDTO laptopDTO=new LaptopDTO(1, "Laptop", "Red", 80);
        LaptopDTO laptopDTO1=new LaptopDTO(2,"dell","gray",20000) ;
        LaptopDTO laptopDTO2=new LaptopDTO(3,"HP","black",5000) ;
        LaptopDTO laptopDTO3=new LaptopDTO(4,"Lenovo","white",7000) ;
        LaptopDTO laptopDTO4=new LaptopDTO(5,"Asus","silver",10000) ;
        LaptopDTO laptopDTO5=new LaptopDTO(6,"MacBook","blue",15000) ;

        List<LaptopDTO> laptoplist= Arrays.asList(laptopDTO,laptopDTO1,laptopDTO2,laptopDTO3,laptopDTO4,laptopDTO5);
        System.out.println("LaptopDTOs sorted by price in ascending order:");
        Collections.sort(laptoplist);
        laptoplist.stream().forEach(System.out::println);
        System.out.println("LaptopDTOs with price greater than 10000:");
        laptoplist.stream()
                .filter(laptopdetails -> laptopdetails
                        .getPrice() > 10000)
                .forEach(laptopdetails -> System.out.println(laptopdetails) );


    }
}
