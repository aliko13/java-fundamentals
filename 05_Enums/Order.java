public class Order {
    private int orderId;
    private OrderStatusEnum status;

    public Order(int orderId, OrderStatusEnum status) {
        this.orderId = orderId;
        this.status = status;
    }

    public void advanceStatus() {
        switch (status) {
            case PENDING -> status = OrderStatusEnum.PROCESSING;
            case PROCESSING -> status = OrderStatusEnum.SHIPPED;
            case SHIPPED -> status = OrderStatusEnum.DELIVERED;
            case DELIVERED, CANCELLED -> System.out.println("No further transitions allowed.");
        }
    }

    public void printStatus() {
        System.out.println("Order " + orderId + " status: " + status);
    }
}
