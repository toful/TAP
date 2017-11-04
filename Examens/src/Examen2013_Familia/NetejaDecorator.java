package Examen2013_Familia;

/**
 * Created by milax on 02/11/17.
 */
public class NetejaDecorator extends Pare{

    private Pare client;

    public NetejaDecorator(Pare client) {
        super(client.getEdat(), client.getNom());
        this.client=client;
    }

    @Override
    public String presentacio(String tab) {
        String s;
        s=client.presentacio(tab);
        s=s+"\n"+tab+"M'encarrego de fer les feines de la casa";
        return s;
    }

}
