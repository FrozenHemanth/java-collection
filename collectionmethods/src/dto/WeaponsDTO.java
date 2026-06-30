package dto;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class WeaponsDTO implements Serializable {
    @EqualsAndHashCode.Include
    String name;
    double ammo;
     String damage;
    String range;
    String type;
    String material;
    int magsize;
    boolean ismelee;
    boolean automatic;

}
