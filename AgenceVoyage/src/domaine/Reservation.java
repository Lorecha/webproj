package domaine;

import java.util.ArrayList;

public final class Reservation {

    protected int numReservation;    //nr de reservation
   // protected int etatReservation; //l'etat de la resrvation :
    protected ArrayList<Voyageur> listeVoyageur ; // liste des voyageurs
    protected double prixtotal; // le prix total du voyage calcule dans la calss client
    protected Client client;
    protected String nomVoyage;
    protected Voyage voyage;
    protected Assurance assurance;
    protected EtatsReservation etatsReservasion;
    static int compteur=0;

    public Reservation(int numReservation, int etatReservation, double prix, Client client, String nomVoyage, Voyage voyage) {
        this.numReservation = numReservation;
        //le prix unitar on le connait du voyage
        this.client = client;
        this.nomVoyage = nomVoyage;
        this.voyage = voyage;
    }

   public Reservation (Voyageur voyageur)
   {
       this.listeVoyageur.add(voyageur);
   }
 public static double nrvoyageurs(ArrayList<Voyageur> listedevoyageurs)
 {
    int nrvoyageurs=0;
     //parcuri la liste calculer le nr total des voyageurs
     //ensuite calculer le prix total
    return nrvoyageurs;
 }

   // public  Reservation trouverreservation()


    public void removeVoyageur(Voyageur  v) //efface un voyageur de la reservation
    {
//cherche un voyageur et il l'efface de la reservation
    }
    //une methode qui regarde si il y a encore des voyafeur a cette reservation sion effacer reservation


// prix du voyage il faut voir le nr de voyageurs et leur age
    public void setPrix() {
        this.prixtotal= calculprixtotal(this.listeVoyageur);
    }
public static double calculprixtotal(ArrayList<Voyageur> listedevoyageurs)
{double prixtotal=0;
    //parcurir la liste et verifier l'age de voyageur et calculer me prixtotal de la reservation
    return prixtotal;
}

    // add client si paiment effectue et changer de status

}

@Override
public String toString() {
	return "Reservation [numeroReservation=" + numeroReservation + ", etatReservation=" + etatReservation + ", client="
			+ client + ", assurance=" + assurance + ", voyage=" + voyage + ", prixTotal=" + prixTotal + "]";
}


}


//choisir l'offre -il a deja choisit quanf on vas lui faire un dossier
//choisir la liste de voyageur
//choisir l'assurance

