package exam2;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by pedrotgn on 06/10/16.
 */
public class Mailer {
    private Map<String,Site> sites = new HashMap<>();

    public void addSite(Site site){
        sites.put(site.getName(),site);
    }

    public void send(Message msg){
        sites.get(msg.getDestination()).send(msg);
    }

    public int countMessages(String site){
        return sites.get(site).getMessages().size();
    }

    public List<String>  peopleFrom(String city){
        List<String> result = new LinkedList<>();

        for (Site site:sites.values()){
            result.addAll(site.getMessages().stream().filter(m->m.getSource().equals(city)).map(m->m.getFrom()).collect(Collectors.toList()));
        }

        return result;
    }


}
