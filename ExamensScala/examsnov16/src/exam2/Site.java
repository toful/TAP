package exam2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by pedrotgn on 06/10/16.
 */
public class Site {
    private String name;
    private List<Message> messages = new LinkedList<>();

    public String getName() {
        return name;
    }

    public Site(String name) {
        this.name = name;

    }
    public void send(Message msg){
        messages.add(msg);
    }

    public List<Message> getMessages() {
        return messages;
    }
}
