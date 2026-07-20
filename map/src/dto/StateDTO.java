package dto;
import lombok.*;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class StateDTO implements Serializable {
    private String name;
    private String capital;



}
