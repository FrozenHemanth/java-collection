package dto;
import lombok.*;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MovieDTO implements Serializable {
    private String name;
    private String director;

}
