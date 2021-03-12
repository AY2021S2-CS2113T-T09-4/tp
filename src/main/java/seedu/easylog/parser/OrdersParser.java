package seedu.easylog.parser;

import seedu.easylog.commands.orderscommands.OrdersAddCommand;
import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.item.Item;

import java.util.ArrayList;

/**
 * Process orders commands input.
 */
public class OrdersParser extends Parser {

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
            }
            break;
        case (Constants.COMMAND_DELETE):
            break;
        case(Constants.COMMAND_LIST):
            break;
        default:
            ui.showOrdersHelp();
        }
    }

    public ArrayList<Item> processItemsAddedToOrder(String itemsAdded) {
        ArrayList<Item> itemsAddedToOrder = new ArrayList<>();
        String[] splitInput = itemsAdded.split(" ");
        for (String input: splitInput) {
            int index = Integer.parseInt(input) - Constants.ARRAY_OFFSET;
            itemsAddedToOrder.add(itemManager.getItem(index));
        }
        return itemsAddedToOrder;
    }
}
