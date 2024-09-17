package by.vitikova.message.editor.handler.parent;

/**
 * Абстрактный класс для обработчиков сообщений.
 */
public abstract class MessageHandler {

    protected MessageHandler nextHandler;

    /**
     * Устанавливает следующий обработчик в цепочке.
     *
     * @param nextHandler следующий обработчик.
     */
    public void setNextHandler(MessageHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * Абстрактный метод для обработки сообщения.
     *
     * @param message сообщение для обработки.
     */
    public abstract void handle(String message);
}