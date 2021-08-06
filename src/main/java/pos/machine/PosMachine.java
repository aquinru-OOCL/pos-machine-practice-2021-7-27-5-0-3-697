package pos.machine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class PosMachine {

    public String printReceipt(List<String> barcodes) {
        List<Item> itemsWithDetail = loadAllItemsInfo(barcodes);
        return null;
    }

    private List<Item> loadAllItemsInfo(List<String> barcodes) {
        List<Item> itemWithDetails = new ArrayList<>();
        List<String> distinctBarCodes;
        distinctBarCodes = barcodes.stream()
                .distinct()
                .collect(Collectors.toList());

        for (String barcode : distinctBarCodes){
            ItemInfo itemInfo = ItemDataLoader.loadAllItemInfos().stream()
                    .filter( b -> b.getBarcode().equals(barcode))
                    .findFirst().get();

            itemWithDetails.add(new Item(itemInfo.getName(), itemInfo.getPrice(), Collections.frequency(barcodes,barcode)));
        }
        return itemWithDetails;
    }

    private List<Item> calculateSubTotal(List<Item> itemsWithDetail) {
        List<Item> itemsWithSubtotal = new ArrayList<>();

        for (Item item : itemsWithDetail){
            itemsWithSubtotal.add(new Item(item.getName(), item.getPrice(), item.getQuantity()));
        }

        return itemsWithSubtotal;
    }

    private int calculateTotal(List<Item> itemsWithSubTotal) {
        int totalPrice = 0;
        for(Item item : itemsWithSubTotal){
            totalPrice += item.getSubtotal();
        }
        return totalPrice;
    }

}
