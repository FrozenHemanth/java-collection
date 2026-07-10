package Runner;

import dto.LaptopDTO;
import dto.ProcessorDTO;
import sort.ProcessorPriceSorter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProcessorRunner {
    public static void main(String[] args) {

        ProcessorDTO processorDTO = new ProcessorDTO(1, "Processor", "Brand", 500);
        ProcessorDTO processorDTO1 = new ProcessorDTO(2, "Processor1", "Brand1", 200);
        ProcessorDTO processorDTO2 = new ProcessorDTO(3, "Processor2", "Brand2", 300);
        ProcessorDTO processorDTO3 = new ProcessorDTO(4, "Processor3", "Brand3", 400);
        ProcessorDTO processorDTO4 = new ProcessorDTO(5, "Processor4", "Brand4", 500);
        ProcessorDTO processorDTO5 = new ProcessorDTO(6, "Processor5", "Brand5", 100);

        List<ProcessorDTO> list= Arrays.asList(processorDTO,processorDTO1,processorDTO2,processorDTO3,processorDTO4,processorDTO5);


        Collections.sort(list, new ProcessorPriceSorter());
        list.stream().forEach(System.out::println);


    }
}
