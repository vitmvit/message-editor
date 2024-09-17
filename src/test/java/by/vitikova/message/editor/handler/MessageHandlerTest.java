package by.vitikova.message.editor.handler;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MessageHandlerTest {

    @Test
    void loggingHandlerTest() {
        var outputStream = new ByteArrayOutputStream();
        var originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        try {
            var loggingHandler = new LoggingHandler();
            String message = "Test message";
            String expectedOutput = "Logging message: Test message\n";

            loggingHandler.handle(message);

            assertTrue(outputStream.toString().contains(expectedOutput));
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    void spamFilterHandlerTest() {
        var spamFilterHandler = new SpamFilterHandler();
        var message = "Hello, World!";

        spamFilterHandler.setNextHandler(new LoggingHandler());

        assertDoesNotThrow(() -> spamFilterHandler.handle(message));
        assertDoesNotThrow(() -> spamFilterHandler.handle("Spam detected: " + message));
    }
}