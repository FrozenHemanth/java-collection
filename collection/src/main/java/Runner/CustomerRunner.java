package Runner;

import dto.CustomerDTO;
import dto.EmployeDTO;

import java.util.*;

public class CustomerRunner {
    public static void main(String[] args) {

        CustomerDTO customerDTO1 = new CustomerDTO(1,"akash","akash@gmail.com","1234567890","123 Main St");


        CustomerDTO customerDTO2 = new CustomerDTO(2,"jane","jane@gmail.com","0987654321","456 Elm St");
        CustomerDTO customerDTO3 = new CustomerDTO(3,"bob","bob@gmail.com","1111111111","789 Oak St");
        Collection<CustomerDTO> customers = new ArrayList<>(2);
        customers.add(customerDTO1);
        customers.add(customerDTO2);
        customers.add(customerDTO3);
        System.out.println("total customers "+customers.size());

        Collection<CustomerDTO> customers2 = new HashSet<>();
        customers2.add(customerDTO1);


        System.out.println("total customers "+customers2.size());

        Collection<CustomerDTO> customers3 = new LinkedList<>();
        customers3.add(customerDTO1);
        customers3.add(customerDTO2);

        System.out.println("total customers "+customers3.size());

        EmployeDTO employeDTO = new EmployeDTO(1,"akash","akash@gmail.com","1234567890",45000.0);
        EmployeDTO employeDTO2 = new EmployeDTO(2,"jane","jane@gmail.com","0987654321",50000.0);
        Collection<EmployeDTO> employees = new ArrayList<>(2);
        employees.add(employeDTO);
        employees.add(employeDTO2);
        System.out.println("total employees "+employees.size());

        Collection<EmployeDTO> employeDTOS = new LinkedHashSet<>();
        employeDTOS.add(employeDTO);
        employeDTOS.add(employeDTO2);
        System.out.println("total employees "+employeDTOS.size());
        }
    }


