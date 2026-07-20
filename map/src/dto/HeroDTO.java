package dto;
import lombok.*;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class HeroDTO implements Serializable {
    private String name;
    private Double payment ;

}
