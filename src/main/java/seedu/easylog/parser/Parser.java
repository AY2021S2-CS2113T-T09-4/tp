package seedu.easylog.parser;

import seedu.easylog.commands.ExitCommand;
import seedu.easylog.common.Constants;
import seedu.easylog.item.ItemManager;
import seedu.easylog.ui.Ui;

/**
 * Process raw user input.
 */
public class Parser {

    public static Ui ui = new Ui();
    public static ItemManager itemManager = new ItemManager();

    public static String[] splitCommandWordAndArgs(String rawUserInput) {
        String[] splitCommand = rawUserInput.split(" ", 2);
        return splitCommand.length == 2 ? splitCommand : new String[] {splitCommand[0], ""};
    }

    public void processUserInput(String rawUserInput) {
        String[] commandTypeAndParams = splitCommandWordAndArgs(rawUserInput);
        String commandType = commandTypeAndParams[0];
        String commandArgs = commandTypeAndParams[1];
        switch (commandType) {
        case (Constants.COMMAND_HELP):
            ui.showHelp();
            break;
        case(Constants.COMMAND_EXIT):
            new ExitCommand().execute();
            break;
        case(Constants.COMMAND_ITEMS):
            ItemsParser.processItemsInput(commandArgs);
            break;
        case (Constants.COMMAND_ORDERS):
            OrdersParser.processOrdersInput(commandArgs);
            break;
        default:
            ui.showInvalidCommand();
        }
    }
}
