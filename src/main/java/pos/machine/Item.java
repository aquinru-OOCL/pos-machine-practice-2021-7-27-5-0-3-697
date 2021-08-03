package pos.machine;

public class Item {
    private final String name;
    private final int price;
    private final int quantity;
    private final int subtotal;

    public Item(String name, int price, int quantity, int subtotal) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.subtotal = quantity * price;
    }

    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public int getPrice() { return price; }
    public int getSubtotal() { return subtotal; }
}
