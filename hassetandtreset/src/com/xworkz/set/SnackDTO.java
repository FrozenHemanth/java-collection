package com.xworkz.set;
import lombok.*;
import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SnackDTO implements Serializable,Comparable<SnackDTO> {
    private String name;
    private String flavor;
    private double weight;
    private double price;


    @Override
    public int compareTo(SnackDTO o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SnackDTO snackDTO = (SnackDTO) o;
        return  Objects.equals(flavor, snackDTO.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, flavor, weight, price);
    }
}
