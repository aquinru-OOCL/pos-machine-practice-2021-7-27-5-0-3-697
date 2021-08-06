package pos.machine;

class Item{
    private final String name;
    private final int price;
    private final int quantity;
    private final int subtotal;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.subtotal = price * quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public int getSubtotal(){
        return subtotal;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
