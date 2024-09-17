package by.vitikova.message.editor.command.impl;

import by.vitikova.message.editor.command.MessageCommand;
import by.vitikova.message.editor.message.Message;
import lombok.AllArgsConstructor;

/**
 * Интерфейс для команд.
 */
@AllArgsConstructor
public class SendMessageCommand implements MessageCommand {

    private final Message message;

    @Override
    public void execute() {
        System.out.println("Sending message: " + message.getContent());
    }
}
