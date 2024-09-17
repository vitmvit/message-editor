package by.vitikova.message.editor.message;

import by.vitikova.message.editor.message.impl.TextMessage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageTest {

    @Test
    void textMessageShouldReturnNewMessage() {
        var expected = "Hello, World!";

        var actual = new TextMessage(expected);

        assertEquals(expected, actual.getContent());
    }
}