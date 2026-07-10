package dto;
import lombok.*;

import java.io.Serializable;
import java.util.Comparator;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class LaptopDTO implements Serializable, Comparable<LaptopDTO> {
    private int id;
    private String name;
    private String color;
    private int price;

    @Override
    public int compareTo(LaptopDTO o) {
        return Integer.compare(this.price, o.price);
    }
}
