package seedu.easylog.commands.orderscommands;

import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.item.Item;
import seedu.easylog.order.Order;

import java.util.ArrayList;

public class OrdersAddCommand extends OrdersCommand {

    public void execute(String ordersArg) throws EmptyNameException {
        if (ordersArg.equals("")) {
            throw new EmptyNameException();
        }
        String customerName = ordersArg;
        ui.showAddItemsToOrder();
        String itemsAdded = Constants.SCANNER.nextLine();
        ArrayList<Item> itemsInOrder = ordersParser.processItemsAddedToOrder(itemsAdded);
        Order order = new Order(customerName, itemsInOrder);
        orderManager.addOrder(order);
        ui.showOrderAdded(order);
    }
}
