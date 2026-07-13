package dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DiseaseDTO implements Serializable,Comparable<DiseaseDTO> {

    private int id;
    private String name;
    private String description;
    private String symptoms;
    private String cause;
    private String treatment;
    private String cure;
    private String prevention;
    private String etiology;

    public DiseaseDTO(int id, String name ,String description
            , String symptoms, String cause, String treatment
            , String cure, String prevention)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.symptoms = symptoms;
        this.cause = cause;
        this.treatment = treatment;
        this.cure = cure;
        this.prevention = prevention;


    }

    @Override
    public int compareTo(DiseaseDTO o) {
        return Integer.compare(this.id, o.id);
    }
}
