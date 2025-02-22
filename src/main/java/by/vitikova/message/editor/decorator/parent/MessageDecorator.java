package by.vitikova.message.editor.decorator.parent;

import by.vitikova.message.editor.message.Message;
import lombok.AllArgsConstructor;

/**
 * Абстрактный класс для декораторов сообщения.
 */
@AllArgsConstructor
public class MessageDecorator implements Message {

    private final Message decoratedMessage;

    @Override
    public String getContent() {
        return decoratedMessage.getContent();
    }

    protected Message getDecoratedMessage() {
        return decoratedMessage;
    }
}
