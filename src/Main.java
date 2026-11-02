public class Main {

    public static void main(String[] args) {
        // WE are the "container": we create the objects and connect them

        Notifier email = new EmailNotifier();

        OrderService emailOrders = new OrderService(email);
        emailOrders.placeOrder("Laptop");

        SmsNotifier smsNotifier = new SmsNotifier();

        OrderService smsOrders = new OrderService(smsNotifier);
        smsOrders.placeOrder("Mouse");

        // Extra: the same OrderService, with a fake notifier
        FakeNotifier fake = new FakeNotifier();

        OrderService testOrders = new OrderService(fake);
        testOrders.placeOrder("Keyboard");
        System.out.println("Messages sent: " + fake.getSentCount());
    }
}
