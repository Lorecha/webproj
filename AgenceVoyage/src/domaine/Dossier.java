package domaine;

import java.util.ArrayList;

public class Dossier {
    private int nrvoyageurs;
    private ArrayList<Voyageur> listevoyageurs;
    private Assurance assurance;
    private Destination destination;
    private Formule formule;

    public Dossier(int nrvoyageurs, Assurance assurance, Destination destination, Formule formule) {
        this.nrvoyageurs = nrvoyageurs;
        this.assurance = assurance;
        this.destination = destination;
        this.formule = formule;
    }

    public  void addVoyageur(Voyageur voyageur) {
        this.listevoyageurs.add(voyageur) ;
    }
}


