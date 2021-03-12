package seedu.easylog.order;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seedu.easylog.item.Item;
import java.util.ArrayList;


public class OrderTest {

    @Test
    public void getAddOrderMessageTest() {
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Item("ps5"));
        itemList.add(new Item("water"));
        String customerName = "weisheng";
        assertEquals("Got it! The order for customer [weisheng] is added.",
                new Order(customerName, itemList).getAddOrderMessage());
    }
}
