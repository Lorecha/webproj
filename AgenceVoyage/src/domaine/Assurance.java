package domaine;

/**
 *  L'utilisateur peut souscrire une assurance
 */
public class Assurance {

    public double prix;
    public Contrat  contrat;
    public Reservation  reservation;

    public Assurance(double prix, Contrat contrat, Reservation reservation) {
        this.prix = prix;
        this.contrat = contrat;
        this.reservation = reservation;
    }
}