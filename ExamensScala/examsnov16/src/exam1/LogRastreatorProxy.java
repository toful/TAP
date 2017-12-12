package exam1;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by pedrotgn on 07/10/16.
 */
public class LogRastreatorProxy extends Rastreator {
    private List<Predicate> suspicious = new LinkedList<>();

    public List<Predicate> getSuspicious() {
        return suspicious;
    }

    @Override
    public List<Hotel> executeQuery(Predicate<Hotel> predicate) {
        suspicious.add(predicate);
        return super.executeQuery(predicate);
    }
}
