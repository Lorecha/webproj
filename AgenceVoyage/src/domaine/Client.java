package domaine;

/**
 *  Le client n'est pas forcement voyageur, c'est celui ou celle qui finance le voyage.
 */
public class Client extends Personne {
    public Reservation  myReservation;
    public Facture  myFacture;
    public MoyenPaiement MoyenPaiement;
    public  String user="Client1";
    public  String password ="123456";

    public Client(String civilite, String nom, String prenom, String email, Adresse myAdresse) {
        super(civilite, nom, prenom, email, myAdresse);
    }

    public boolean authenitification ( String userName, String password) {
        return (userName.equals(this.user) && password.equals(this.password));
    }
 /*   public boolean authenitification11 throws exception ( String userName, String password) {
        if  (userName.equals(this.user) && password.equals(this.password)) return true;
        else return
    }
*/

    /**
   * 
   * @element-type Domaine.MoyenPaiement
   */
  public MoyenPaiement  myMoyenPaiement;

    
}