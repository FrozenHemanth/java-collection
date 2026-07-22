package dto;
import lombok.*;
import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class HeroDTO implements Serializable {
    private String name;
    private Double payment ;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HeroDTO heroDTO = (HeroDTO) o;
        return Objects.equals(name, heroDTO.name) && Objects.equals(payment, heroDTO.payment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, payment);
    }
}
