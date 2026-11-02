public class OrderService {

    // The dependency: OrderService needs a Notifier, but does NOT create it
    private final Notifier notifier;

    // Dependency injection by constructor: someone gives us the Notifier
    public OrderService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void placeOrder(String product) {
        System.out.println("Order placed: " + product);
        notifier.send("Your order of " + product + " is confirmed");
    }
}
