package by.vitikova.message.editor.handler;

import by.vitikova.message.editor.handler.parent.MessageHandler;

/**
 * Обработчик, который фильтрует спам-сообщения.
 */
public class SpamFilterHandler extends MessageHandler {

    @Override
    public void handle(String message) {
        if (!message.toLowerCase().contains("spam")) {
            if (nextHandler != null) {
                nextHandler.handle(message);
            }
        } else {
            System.out.println("Spam detected: " + message);
        }
    }
}