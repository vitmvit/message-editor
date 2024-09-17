package by.vitikova.message.editor.decorator;

import by.vitikova.message.editor.message.impl.TextMessage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageDecoratorTest {

    @Test
    void boldMessageDecoratorShouldReturnBoldMessage() {
        var message = new TextMessage("Hello, World!");
        var expected = "<b>" + message.getContent() + "</b>";

        var actual = new BoldMessageDecorator(message);

        assertEquals(expected, actual.getContent());
    }

    @Test
    void boldMessageDecoratorShouldReturnItalicMessage() {
        var message = new TextMessage("Hello, World!");
        var expected = "<i><b>" + message.getContent() + "</b></i>";

        var actual = new ItalicMessageDecorator(new BoldMessageDecorator(message));

        assertEquals(expected, actual.getContent());
    }
}