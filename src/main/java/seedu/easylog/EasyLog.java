package seedu.easylog;

import seedu.easylog.parser.Parser;
import seedu.easylog.ui.Ui;

import java.util.Scanner;

public class EasyLog {

    private static final Ui ui = new Ui();
    private static final Parser parser = new Parser();

    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Main entry-point for the easyLog application.
     */
    public static void main(String[] args) {
        ui.showGreeting();
        while (true) {
            String userInput = SCANNER.nextLine();
            parser.processUserInput(userInput);
        }
    }

}
