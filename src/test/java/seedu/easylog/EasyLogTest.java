package seedu.easylog;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EasyLogTest {

    @Test
    public void sampleTest() {
        assertTrue(true);
    }

    @Test
    @DisplayName("Should Print the Greeting Message")
    public void easyLog_shouldPrintGreetingMessage() {
        assertEquals("Hello! I'm easyLog!\\n\" + \"What can I do for you? Enter help to view commands.",
                "Hello! I'm easyLog!\\n\" + \"What can I do for you? Enter help to view commands.");
    }

}