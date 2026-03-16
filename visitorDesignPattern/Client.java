public class Client {
    public static void main(String[] args) {
        Furniture[] items = {
            new Chair(),
            new Table(3),
            new Sofa(50)
        };

        ShippingVisitor calculator = new ShippingCostCalculator();

        for (Furniture item : items) {
            item.accept(calculator);
        }
    }
}
