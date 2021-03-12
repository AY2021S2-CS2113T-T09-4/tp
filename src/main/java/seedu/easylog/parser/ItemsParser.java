package seedu.easylog.parser;

import seedu.easylog.commands.itemscommands.ItemsAddCommand;
import seedu.easylog.commands.itemscommands.ItemsDeleteCommand;
import seedu.easylog.commands.itemscommands.ItemsListCommand;
import seedu.easylog.common.Constants;
import seedu.easylog.exceptions.EmptyNameException;
import seedu.easylog.exceptions.EmptyNumberException;

/**
 * Process items command input.
 */
public class ItemsParser extends Parser {

    public static void processItemsInput(String itemsInput) {
        String[] splitItemsArg = splitCommandWordAndArgs(itemsInput);
        String itemsType = splitItemsArg[0];
        String itemsArg = splitItemsArg[1];
        switch (itemsType) {
        case (Constants.COMMAND_ADD):
            try {
                new ItemsAddCommand().execute(itemsArg);
            } catch (EmptyNameException e) {
                ui.showItemEmptyName();
            }
            break;
        case (Constants.COMMAND_DELETE):
            try {
                new ItemsDeleteCommand().execute(itemsArg);
            } catch (EmptyNumberException e) {
                ui.showEmptyNumber();
            }
            break;
        case (Constants.COMMAND_LIST):
            new ItemsListCommand().execute();
            break;
        default:
            ui.showItemsHelp();
        }
    }
}
