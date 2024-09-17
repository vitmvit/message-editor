package by.vitikova.message.editor.message.impl;

import by.vitikova.message.editor.message.Message;
import lombok.AllArgsConstructor;

/**
 * Класс текстового сообщения.
 */
@AllArgsConstructor
public class TextMessage implements Message {

    private final String content;

    @Override
    public String getContent() {
        return content;
    }
}