package seedu.easylog.ui;

import seedu.easylog.common.Messages;
import seedu.easylog.item.Item;

/**
 * Handles ui related methods.
 */
public class Ui {

    public void showGreeting() {
        System.out.println(Messages.GREETING_MESSAGE);
    }

    public void showExit() {
        System.out.println(Messages.EXIT_MESSAGE);
    }

    public void showHelp() {
        System.out.println(Messages.HELP_MESSAGE);
    }

    public void showItemsHelp() {

    }

    public void showInvalidCommand() {

    }

    public void showAddItem(Item item) {

    }

    public void showEmptyName() {

    }
}
