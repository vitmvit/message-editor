package by.vitikova.message.editor.handler;

import by.vitikova.message.editor.handler.parent.MessageHandler;

/**
 * Обработчик, который логгирует сообщения.
 */
public class LoggingHandler extends MessageHandler {

    @Override
    public void handle(String message) {
        System.out.println("Logging message: " + message);
        if (nextHandler != null) {
            nextHandler.handle(message);
        }
    }
}