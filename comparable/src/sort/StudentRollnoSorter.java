package sort;

import Runner.StudentRunner;
import dto.StudentDTO;

import java.util.Comparator;

public class StudentRollnoSorter implements Comparator<StudentDTO> {
    @Override
    public int compare(StudentDTO o1, StudentDTO o2) {
        return Integer.compare(o1.getRollno(), o2.getRollno());
    }


    }

