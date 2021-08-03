package pos.machine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PosMachine {
    public String printReceipt(List<String> barcodes) {
        convertToItems(barcodes);

        return null;
    }

    private List<Item> convertToItems(List<String> barcodes) {
        List<String> distinctBarcodes;
        distinctBarcodes = barcodes.stream().distinct().collect(Collectors.toList());

        List<Item> itemsWithDetails = new ArrayList<>();
        for (String barcode : distinctBarcodes) {
            //ItemInfo itemInfo = ItemDataLoader.loadAllItemInfos();
            //itemsWithDetails.add());
        }

        return itemsWithDetails;
    }

    private List<Item> calculateSubTotalAndTotal(List<Item> itemsWithDetails) {
        //

        return null;
    }

}
