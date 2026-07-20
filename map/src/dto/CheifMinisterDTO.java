package dto;
import lombok.*;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CheifMinisterDTO implements Serializable {
    private String name;
    private String party;
;

}
