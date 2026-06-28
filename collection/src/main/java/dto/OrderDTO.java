package dto;

public class OrderDTO {

    private int orderId;
    private int customerId;
    private String localDateOfOrder;
    private String orderDate;
    private String status;
    private Double totalAmount;

    public OrderDTO(int orderId, int customerId, String localDateOfOrder, String orderDate, String status, Double totalAmount) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.localDateOfOrder = localDateOfOrder;
        this.orderDate = orderDate;
        this.status = status;
        this.totalAmount = totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getLocalDateOfOrder() {
        return localDateOfOrder;
    }

    public void setLocalDateOfOrder(String localDateOfOrder) {
        this.localDateOfOrder = localDateOfOrder;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
