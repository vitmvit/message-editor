package by.vitikova.message.editor.decorator;

import by.vitikova.message.editor.decorator.parent.MessageDecorator;
import by.vitikova.message.editor.message.Message;

/**
 * Декоратор для добавления жирного шрифта к сообщению.
 */
public class BoldMessageDecorator extends MessageDecorator {

    public BoldMessageDecorator(Message decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public String getContent() {
        return "<b>" + getDecoratedMessage().getContent() + "</b>";
    }
}
