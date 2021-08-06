package pos.machine;

import java.util.List;

public class Receipt {
    private final List<Item> itemDetail;
    private final int totalPrice;
    public Receipt(List<Item> itemDetail, int totalPrice){
        this.itemDetail = itemDetail;
        this.totalPrice = totalPrice;
    }

    public List<Item> getItemDetail(){
        return itemDetail;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

}
