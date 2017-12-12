package exam2;

/**
 * Created by pedrotgn on 06/10/16.
 */
public class Message {
    private String from;
    private String source;
    private String destination;
    private String text;

    public Message(String source, String from, String destination, String text) {
        this.source = source;
        this.from = from;
        this.destination = destination;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public String getSource() {
        return source;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public String getDestination() {
        return destination;
    }

    public String getText() {
        return text;
    }
}
