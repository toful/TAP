package Problema_Banc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by milax on 08/09/17.
 */
public class Prova_Banc {
    public static void main(String[] args) {

        Banc b = new Banc("BBVA");
        Propietari p1 = new Propietari(1, "Paco", 123456789, "carrer palomo");
        Propietari p2 = new Propietari(2, "Paca", 223456789, "carrer pixo");
        Propietari p3 = new Propietari(3, "Ramón", 323456789, "carrer tortora");
        Propietari p4 = new Propietari(4, "Ramona", 423456789, "carrer pinçar");
        Propietari p5 = new Propietari(5, "Fernando", 523456789, "carrer tord");
        Propietari p6 = new Propietari(6, "Fernanda", 623456789, "carrer colom");
        Propietari p7 = new Propietari(7, "Ermenegildo", 723456789, "carrer x");

        BA c1 = new BA(2500, p1);
        BA c2 = new BA(3000, p2);
        CA c3 = new CA(150, p3);
        CA c4 = new CA(300, p4);
        IF c5 = new IF(2310, p5);
        IF c6 = new IF(2300, p6);
        SA c7 = new SA(500, p7);


        b.afegirPropietari(p1);
        b.afegirPropietari(p2);
        b.afegirPropietari(p3);
        b.afegirPropietari(p4);
        b.afegirPropietari(p5);
        b.afegirPropietari(p6);
        b.afegirPropietari(p7);

        b.afegirCompte(c1);
        b.afegirCompte(c2);
        b.afegirCompte(c3);
        b.afegirCompte(c4);
        b.afegirCompte(c5);
        b.afegirCompte(c6);
        b.afegirCompte(c7);

        System.out.println(b.getComptes());


        b.revision();

        System.out.println(b.getComptes());

        /*try {
            FileReader fitxer = new FileReader("propietaris.txt");
            BufferedReader dis = new BufferedReader(fitxer);
            String line, nom, adre;
            int id, num;
            try {
                while ((line = dis.readLine()) != null) {
                    StringTokenizer tokens = new StringTokenizer(line, ",");
                    while (tokens.hasMoreTokens()) {
                        id=Integer.parseInt(tokens.nextToken());
                        nom=tokens.nextToken();
                        num=Integer.parseInt(tokens.nextToken());
                        adre=tokens.nextToken();
                        p=new Propietari(id,nom,num,adre);
                        b.afegirPropietari(p);
                        System.out.println(p);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error al llegir del fitxe.");
            }
            fitxer.close();
        } catch (IOException e) {
            System.out.println("No s'ha pogut obrir el fitxer.");
        }*/


    }
}