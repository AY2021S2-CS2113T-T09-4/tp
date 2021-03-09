package seedu.easylog.common;

public class Messages {

    // Messages to be printed out during the interaction with the user
    public static final String GREETING_MESSAGE =
            "Hello! I'm easyLog!\n" + "What can I do for you? Enter help to view commands.";
    public static final String EXIT_MESSAGE = "Bye. Thanks for using easyLog!";
    public static final String HELP_MESSAGE = "General Options:\n"
            + "  1. items                          Show items-related commands\n"
            + "  2. items add <item_name>          Add an item\n"
            + "  3. items list                     List all items\n"
            + "  4. items remove <item_name>       Remove an item\n"
            + "  5. items clear                    Empty all items\n"
            + "  6. orders                         Show orders-related commands\n"
            + "  7. orders add <order_name>        Add an order\n"
            + "  8. orders list                    List all orders\n"
            + "  9. orders remove <order_name>     Remove an order\n"
            + "  10. orders clear                  Empty all orders\n";
}
