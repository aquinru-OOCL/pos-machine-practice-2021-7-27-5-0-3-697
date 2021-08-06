package pos.machine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class PosMachine {

    private List<Item> loadAllItemsInfo(List<String> barcodes) {
        List<Item> itemWithDetails = new ArrayList<Item>();
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

}
