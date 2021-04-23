package domaine;

import java.util.ArrayList;

/**
 *  Le client n'est pas forcement voyageur, c'est celui ou celle qui finance le voyage.
 */

    public class Client extends Personne {
    	   private ArrayList<Reservation> reservation;
    	   private Facture  facture;
    	   private MoyenPaiment MoyenPaiement;
    	   private  String user="Client1";
    	   private  String password ="123456";
    	   private static int nrclient;  //
    	    private static int compteur=0;


    	 public Client ( String user, String password) //d'abord le client est oblige de se contruire un indentifiant et une mot de passe
    	 {
    	     this.user=user;
    	     this.pasword=password;
    	     this.nrclient=compteur++;
    	 }
    	   public Client(String user, String password,String civilite, String nom, String prenom, String email, String rue, String ville, int codepostal, String region, String pays ) {
    	      super(civilite, nom, prenom, email, rue, ville,  codepostal, pays,region);
    	      this.user = user;
    	      this.password = password;
    	   }
    	   public Client (Reservation reservation) {
    	       this.reservation.add(reservation);
    	   }
    	   //etapes : 1 il s'identifie, si il a deja  un commpte on le cherche et on le trouve
    	    //verifie s'il veut faire un achat
    	   //on lui démande s'il a choisi une voyage on fait une reservation
    	   //on lui demande  s'il veut payer on cherche s'il n'est pas deja enregistre dans le system
    	   //on bloque la reservation et on lui demande de payer
    	   //si oui alors il faut lui  demander  le mode paiement
    	   //si son compte peut etre solde on vas commander l'operation reservation
    	   //sinon on abandone et on lui demande de reesayer de trouvar une autre voyage on pourra lui proposer une selection de voyage a mois cher avec ses criters
    	   //crer une methode qui fait un tri de voyages selon des criters specifiques
    	   //on valide la reservation et on la clos
    	// on envoie les infos generales en voyage
    	   //on fait une facture et on lui envoie
    	   //apres la date datedepart on clos la reservation
    	   //demander le mode de payement
    	public void achat(Reservation reservation, Client client) //a faire
    	{
    	   this.facture.setNrfacture(nrfact);
    	}
    	// si on le client n'est pas nulll, si il s'authenitifie si il a fait une reservation this.facture.getclient.nom()=this.getNom() ;
    	   public boolean authenitification (String userName, String password) {
    	      return (userName.equals(this.user) && password.equals(this.password));
    	   }




    	}


    public boolean authenitification ( String userName, String password) {
        return (userName.equals(this.user) && password.equals(this.password));
    }
	@Override
	public String toString() {
		return "Client nr : =" + nrclient + " user name" + this.user + 

    
}