package by.vitikova.message.editor.command;

import by.vitikova.message.editor.command.impl.SendMessageCommand;
import by.vitikova.message.editor.message.impl.TextMessage;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MessageCommandTest {

    @Test
    void sendMessageCommandShouldExecuteCommand() {
        var outputStream = new ByteArrayOutputStream();
        var originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        try {
            var message = new TextMessage("Hello, World!");
            var expected = "Sending message: Hello, World!";
            var sendMessageCommand = new SendMessageCommand(message);

            sendMessageCommand.execute();

            assertTrue(outputStream.toString().contains(expected));
        } finally {
            System.setOut(originalOut);
        }
    }
}