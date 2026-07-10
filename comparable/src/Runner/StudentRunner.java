package Runner;

import dto.StudentDTO;
import sort.StudentRollnoSorter;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {




        StudentDTO studentDTO=new StudentDTO("Raj", 25, 2, "Maths");
        StudentDTO studentDTO1=new StudentDTO("Akash", 22, 2, "Science");
        StudentDTO studentDTO2=new StudentDTO("Sagar", 23, 4, "English");
        StudentDTO studentDTO3=new StudentDTO("Priya", 24, 5, "History");
        StudentDTO studentDTO4=new StudentDTO("Krishna", 21, 6, "Physics");
        StudentDTO studentDTO5=new StudentDTO("Omkar-xworkz", 22, 7, "Chemistry");

        List<StudentDTO> studentlist= Arrays.asList(studentDTO,studentDTO1,studentDTO2,studentDTO3,studentDTO4,studentDTO5);
        System.out.println("redular Student list:");
        studentlist.forEach(regularlist->System.out.println(regularlist));
        System.out.println("Student list sorted by age:");
        Collections.sort(studentlist, Comparator.comparingInt(StudentDTO::getAge));
        studentlist.forEach(studentlistbyage->System.out.println(studentlistbyage));
        System.out.println("Student list sorted by rollno:");
        Collections.sort(studentlist,Comparator.comparingDouble(StudentDTO::getRollno));
        studentlist.forEach(studentlistbyrollno->System.out.println(studentlistbyrollno));
        System.out.println("Student list sorted by both rollno and age:");
        Collections.sort(studentlist, new StudentRollnoSorter());
        studentlist.forEach(studentlistbyrollno->System.out.println(studentlistbyrollno));
        System.out.println("Student list with rollno greater than 2:");
   studentlist.stream().filter(studentlistbyrollno->studentlistbyrollno.getRollno() > 2).forEach(System.out::println);
   System.out.println("Student list with age greater than 25:");
   studentlist.stream().filter(studentlistbyage->studentlistbyage.getAge() >= 25).forEach(System.out::println);
        System.out.println("E O T D");
    }


}
