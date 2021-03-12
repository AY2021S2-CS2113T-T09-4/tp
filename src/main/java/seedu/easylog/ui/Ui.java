package seedu.easylog.ui;

import seedu.easylog.common.Messages;
import seedu.easylog.item.Item;
import seedu.easylog.order.Order;


/**
 * Handles ui related methods.
 */
public class Ui {

    public void showGreeting() {
        System.out.println(Messages.MESSAGE_GREETING);
    }

    public void showExit() {
        System.out.println(Messages.MESSAGE_GOODBYE);
    }

    public void showHelp() {

    }

    public void showItemsHelp() {

    }

    public void showInvalidCommand() {
        System.out.println(Messages.MESSAGE_INVALID_COMMAND);
    }

    public void showAddItem(Item item) {
        System.out.println(item.getAddItemMessage());
    }

    public void showDeletedItem(Item item) {
        System.out.println(item.getDeleteItemMessage());
    }

    public void showEmptyNumber() {
        System.out.println(Messages.MESSAGE_EMPTY_NUMBER);
    }

    public void showItemList(String rawItemListOutput) {
        System.out.println(Messages.MESSAGE_LIST_ITEMS);
        System.out.print(rawItemListOutput);
    }

    public void showOrdersHelp() {

    }

    public void showAddItemsToOrder() {
        System.out.println(Messages.MESSAGE_ADD_ITEMS_TO_ORDER);
    }

    public void showOrderAdded(Order order) {
        System.out.println(order.getAddOrderMessage());
    }
}
