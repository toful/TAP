package exam2;

/**
 * Created by pedrotgn on 07/10/16.
 */

/**
 * Created by pedrotgn on 07/10/16.
 */
public class StampDecorator extends Mailer {
    private Mailer delegate;

    public StampDecorator(Mailer delegate) {
        this.delegate = delegate;
    }


    @Override
    public void send(Message msg) {
        msg.setText(msg.getText()+" verified by NSA, thanks");
        delegate.send(msg);
    }
}
