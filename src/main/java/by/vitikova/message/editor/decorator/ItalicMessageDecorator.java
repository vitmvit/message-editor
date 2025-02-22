package by.vitikova.message.editor.decorator;

import by.vitikova.message.editor.decorator.parent.MessageDecorator;
import by.vitikova.message.editor.message.Message;

/**
 * Декоратор для добавления курсива к сообщению.
 */
public class ItalicMessageDecorator extends MessageDecorator {

    public ItalicMessageDecorator(Message decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public String getContent() {
        return "<i>" + getDecoratedMessage().getContent() + "</i>";
    }
}