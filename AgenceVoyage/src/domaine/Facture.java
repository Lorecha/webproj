package domaine;

/**
 *  G?n?re facture avec informations ad?quates
 */
public class Facture {
    public Client  myClient;
    public Reservation myReservation;

    public Facture(Client myClient, Reservation myReservation) {
        this.myClient = myClient;
        this.myReservation = myReservation;
    }
}