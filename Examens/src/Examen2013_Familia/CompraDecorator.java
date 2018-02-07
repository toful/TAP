package Examen2013_Familia;

/**
 * Created by milax on 02/11/17.
 */
public class CompraDecorator extends Pare{
    Pare client;

    public CompraDecorator(Pare client) {
        super(client.getEdat(), client.getNom());
        this.client=client;
    }

    @Override
    public String presentacio(String tab) {
        String s;
        s=client.presentacio(tab);
        s=s+"\n"+tab+"Jo sóc qui fa la compra familiar cada semana";
        return s;
    }
}
