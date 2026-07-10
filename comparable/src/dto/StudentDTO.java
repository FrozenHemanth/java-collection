package dto;
import lombok.*;
import java.io.Serializable;
import java.util.Comparator;
@AllArgsConstructor
@ToString@Getter@Setter
public class StudentDTO implements Serializable
{
       String studentname;
       int age;
       int rollno;
       String course;

    }



