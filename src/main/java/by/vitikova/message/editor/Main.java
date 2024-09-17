package by.vitikova.message.editor;

import by.vitikova.message.editor.command.MessageCommand;
import by.vitikova.message.editor.command.impl.SendMessageCommand;
import by.vitikova.message.editor.decorator.BoldMessageDecorator;
import by.vitikova.message.editor.decorator.ItalicMessageDecorator;
import by.vitikova.message.editor.handler.LoggingHandler;
import by.vitikova.message.editor.handler.SpamFilterHandler;
import by.vitikova.message.editor.handler.parent.MessageHandler;
import by.vitikova.message.editor.message.Message;
import by.vitikova.message.editor.message.impl.TextMessage;

public class Main {

    public static void main(String[] args) {
        // Использование паттерна Декоратор
        Message message = new TextMessage("Hello, World!");
        Message boldMessage = new BoldMessageDecorator(message);
        Message italicBoldMessage = new ItalicMessageDecorator(boldMessage);

        // Обработка сообщения через цепочку обязанностей
        MessageHandler logger = new LoggingHandler();
        MessageHandler spamFilter = new SpamFilterHandler();
        logger.setNextHandler(spamFilter);

        // Декорируем и обрабатываем сообщение
        String finalMessage = italicBoldMessage.getContent();
        logger.handle(finalMessage);

        // Использование паттерна Команда
        MessageCommand sendMessageCommand = new SendMessageCommand(italicBoldMessage);
        sendMessageCommand.execute();
    }
}