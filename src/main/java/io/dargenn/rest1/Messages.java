package io.dargenn.rest1;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "messages")
public class Messages<T> {
    @JacksonXmlProperty(localName = "message") private List<T> elements;

    public Messages() {

    }

    public Messages(List<T> elements) {
        this.elements = elements;
    }

    @JacksonXmlElementWrapper
    public List<T> getElements() {
        return elements;
    }
}
