public class Table implements Furniture {
    private int size;

    public Table(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}
