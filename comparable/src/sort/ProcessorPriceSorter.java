package sort;

import dto.ProcessorDTO;

import java.util.Comparator;

public class ProcessorPriceSorter implements Comparator<ProcessorDTO> {
    public int compare(ProcessorDTO o1, ProcessorDTO o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());

    }

    }

