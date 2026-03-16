public class ShippingCostCalculator implements ShippingVisitor {
    @Override
    public void visit(Chair chair) {
        System.out.println("Chair shipping cost: $20 flat rate");
    }

    @Override
    public void visit(Table table) {
        int cost = table.getSize() * 10;
        System.out.println("Table shipping cost: $" + cost);
    }

    @Override
    public void visit(Sofa sofa) {
        int cost = sofa.getDistance() * 5;
        System.out.println("Sofa shipping cost: $" + cost);
    }
}
