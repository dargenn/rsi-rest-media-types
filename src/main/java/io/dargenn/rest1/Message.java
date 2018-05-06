package io.dargenn.rest1;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

public class Message {
    private String content;
    private String author;

    public Message() {
    }

    Message(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}