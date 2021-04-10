package seedu.easylog.commands.orderscommands;

import seedu.easylog.commands.itemscommands.ItemsListCommand;
import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.CustomerNameTooLongException;
import seedu.easylog.exceptions.EmptyItemListException;
import seedu.easylog.exceptions.EmptyNameException;

import seedu.easylog.model.ItemManager;
import seedu.easylog.model.Order;
import seedu.easylog.model.OrderManager;

/**
 * Adds orders to the system.
 */
public class OrdersAddCommand extends OrdersCommand {

    public void execute(String customerName, ItemManager itemManager, OrderManager orderManager)
            throws EmptyNameException, EmptyItemListException, CustomerNameTooLongException {
        if (customerName.equals("")) {
            throw new EmptyNameException();
        }
        if (customerName.length() > Constants.CUSTOMER_NAME_LENGTH_LIMIT) {
            throw new CustomerNameTooLongException();
        }
        if (itemManager.getItemList().isEmpty()) {
            throw new EmptyItemListException();
        }

        ItemsListCommand itemsListCommand = new ItemsListCommand();
        itemsListCommand.execute(itemManager); // to show available items and item stock
        ui.showAddItemsToOrder();
        String addItemsToOrderInput = ui.askForUserInput();
        Order order = ordersParser.processItemsAddedToOrder(customerName, addItemsToOrderInput, itemManager);
        orderManager.addOrder(order);
        assert orderManager.getLatestOrderAdded().equals(order);
        ui.showOrderAdded(order);
    }


}