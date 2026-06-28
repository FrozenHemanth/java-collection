package Runner;

import dto.OrderDTO;

import java.util.ArrayList;
import java.util.Collection;

public class OrderRunner {
    public static void main(String[] args) {

        OrderDTO orderDTO1 = new OrderDTO(1, 1, "2023-01-01", "2023-01-01", "Completed", 100.0);
        OrderDTO orderDTO2 = new OrderDTO(2, 2, "2023-01-02", "2023-01-02", "Completed", 200.0);
        OrderDTO orderDTO3 = new OrderDTO(3, 3, "2023-01-03", "2023-01-03", "Completed", 300.0);
        OrderDTO orderDTO4 = new OrderDTO(4, 4, "2023-01-04", "2023-01-04", "Completed", 400.0);

        Collection<OrderDTO> orders = new ArrayList<>();
        orders.add(orderDTO1);
        orders.add(orderDTO2);
        orders.add(orderDTO3);
        orders.add(orderDTO4);
        System.out.println("total orders " + orders.size());
    }
}
