public class EnumRunner {
    public static void main(String[] args) {
        // --- User Role Example ---
        User user1 = new User("Ali", UserRoleEnum.ADMIN);
        User user2 = new User("Elvin", UserRoleEnum.VIEWER);

        user1.printAccessLevel();
        user2.printAccessLevel();

        // --- Order Status Example ---
        Order order = new Order(101, OrderStatusEnum.PENDING);
        order.printStatus();
        order.advanceStatus();
        order.printStatus();

        // --- Enum with fields & constructor ---
        System.out.println("\nHTTP Status Codes:");
        for (HttpStatus status : HttpStatus.values()) {
            System.out.println(status.getCode() + ": " + status.getMessage());
        }
    }
}
