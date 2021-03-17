package seedu.easylog.parser;

import seedu.easylog.EasyLog;
import seedu.easylog.commands.orderscommands.OrdersAddCommand;
import seedu.easylog.commands.orderscommands.OrdersClearCommand;
import seedu.easylog.commands.orderscommands.OrdersDeleteCommand;
import seedu.easylog.commands.orderscommands.OrdersListCommand;
import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.exceptions.EmptyItemListException;
import seedu.easylog.exceptions.EmptyNumberException;
import seedu.easylog.exceptions.InvalidNumberException;
import seedu.easylog.exceptions.OrderListAlreadyClearedException;
import seedu.easylog.item.Item;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * Process orders commands input.
 */
public class OrdersParser extends Parser {
    private static final Logger logger = Logger.getLogger(EasyLog.class.getName());

    public static void processOrdersInput(String ordersInput) {
        String[] splitOrdersArg = splitCommandWordAndArgs(ordersInput);
        String ordersType = splitOrdersArg[0];
        String ordersArg = splitOrdersArg[1];
        switch (ordersType) {
        case (Constants.COMMAND_ADD):
            try {
                new OrdersAddCommand().execute(ordersArg);
            } catch (EmptyNameException e) {
                ui.showOrderEmptyCustomerName();
            } catch (EmptyItemListException e) {
                ui.showEmptyItemList();
                ui.showAddItemFirst();
            }
            break;
        case (Constants.COMMAND_DELETE):
            try {
                new OrdersDeleteCommand().execute(ordersArg);
            } catch (EmptyNumberException e) {
                ui.showOrderEmptyNumber();
            } catch (InvalidNumberException e) {
                ui.showInvalidOrderNumber();
            }
            break;
        case (Constants.COMMAND_LIST):
            new OrdersListCommand().execute();
            break;
        case (Constants.COMMAND_CLEAR):
            try {
                new OrdersClearCommand().execute();
            } catch (OrderListAlreadyClearedException e) {
                ui.showAlreadyClearedOrderList();
                logger.info("The program fails to clear the order list because it is already empty!");
            }
            break;
        default:
            ui.showOrdersHelp();
        }
    }

    /**
     * Process input for respective items to be added into a specific order.
     * @param itemsAdded Input for the items to be added into a order.
     * @return ArrayList of item for the items in the order.
     */
    public ArrayList<Item> processItemsAddedToOrder(String itemsAdded) {
        ArrayList<Item> itemsAddedToOrder = new ArrayList<>();
        String[] splitInput = itemsAdded.split(" ");
        for (String input : splitInput) {
            int index = Integer.parseInt(input) - Constants.ARRAY_OFFSET;
            try {
                itemsAddedToOrder.add(itemManager.getItem(index));
            } catch (IndexOutOfBoundsException e) {
                ui.showItemNotFound(index);
            }
        }
        return itemsAddedToOrder;
    }


}
