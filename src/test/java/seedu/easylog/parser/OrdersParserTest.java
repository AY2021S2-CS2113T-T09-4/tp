package seedu.easylog.parser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import seedu.easylog.item.Item;
import seedu.easylog.item.ItemManager;
import java.util.ArrayList;

public class OrdersParserTest {

    @Test
    public void processItemsAddedToOrderTest() {
        final OrdersParser ordersParser = new OrdersParser();
        ItemManager itemManager = new ItemManager();

        ArrayList<Item> itemsTestList = new ArrayList<>();
        Item testItem1 = new Item("PS5");
        Item testItem2 = new Item("Keyboard");
        itemManager.addItem(testItem1);
        itemManager.addItem(testItem2);
        assertEquals(itemManager.getItem(0).getItemName(),
                ordersParser.processItemsAddedToOrder("1 2").get(0).getItemName());
        assertEquals(itemManager.getItem(1).getItemName(),
                ordersParser.processItemsAddedToOrder("1 2").get(1).getItemName());
    }
}