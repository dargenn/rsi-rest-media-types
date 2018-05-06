package io.dargenn.rest1;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EverythingController {

    @GetMapping(path = "/zwykly-string", produces = MediaType.TEXT_PLAIN_VALUE)
    public String casualString() {
        return "zwykly super string!";
    }

    @GetMapping(path = "/string-z-parametrem/{parametr}")
    public String stringWithParam(@PathVariable("parametr") String parametr) {
        return "lepszy string, bo dodaje parametr: " + parametr;
    }

    @GetMapping(path = "/xml-messages", produces = MediaType.APPLICATION_XML_VALUE)
    public Messages<Message> getXmlMessages() {
        return new Messages<>(createMessages());
    }

    @GetMapping(path = "/json-messages", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Message> getJsonMessages() {
        return createMessages();
    }

    private List<Message> createMessages() {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("dluga wiadomosc", "ja"));
        messages.add(new Message("srednia wiadomosc", "tez ja tez"));
        messages.add(new Message("krotsza wiadomosc", "tez ja"));
        return messages;
    }
}
