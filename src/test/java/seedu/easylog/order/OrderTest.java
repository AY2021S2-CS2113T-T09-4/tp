package seedu.easylog.order;

import org.junit.jupiter.api.Test;
import seedu.easylog.item.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class OrderTest {
    @Test
    public void testGetOrderName() {
        assertEquals("MP3", new Order("MP3").getOrderName());
    }
}
