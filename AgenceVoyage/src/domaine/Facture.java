package domaine;

/**
 *  G?n?re facture avec informations ad?quates
 */
public class Facture {
    public Client  client;
    public Reservation reservation;

    public Facture(Client client, Reservation reservation) {
        this.client = client;
        this.reservation = reservation;
    }
}