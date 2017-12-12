package exam2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by pedrotgn on 07/10/16.
 */
public class NSADecorator extends Mailer {
    private Mailer delegate;
    private List<Message> suspicious = new LinkedList<>();

    public NSADecorator(Mailer delegate) {
        this.delegate = delegate;
    }

    public List<Message> getSuspicious() {
        return suspicious;
    }

    @Override
    public void send(Message msg) {
        if (msg.getText().contains("isis") || msg.getText().contains("bomb"))
            suspicious.add(msg);
        delegate.send(msg);
    }
}
