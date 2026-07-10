package dto;
import lombok.*;
import sort.ProcessorPriceSorter;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

@AllArgsConstructor
@ToString@Setter@Getter
public class ProcessorDTO implements Serializable {
    private int id;
    private String name;
    private String brand;
    private int price;

    }

