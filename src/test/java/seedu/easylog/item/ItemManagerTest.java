package seedu.easylog.item;

import org.junit.jupiter.api.Test;

import javax.imageio.event.IIOReadProgressListener;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemManagerTest {
    @Test
    public void testAddItem() {
        Item item = new Item("x");
        ItemManager newList = new ItemManager();
        newList.addItem(item);
        assertTrue(newList.contains(item));
    }
}
