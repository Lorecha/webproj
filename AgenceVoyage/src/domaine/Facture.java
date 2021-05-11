package domaine;

/**
 *  G?n?re facture avec informations ad?quates
 */
public class Facture {
    private Client  client;
    private Reservation reservation;
    private int nrfacture;
	/**
	 * @param client
	 * @param reservation
	 * @param nrfacture
	 */
	public Facture(Client client, Reservation reservation, int nrfacture) {
		this.client = client;
		this.reservation = reservation;
		this.nrfacture = nrfacture;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public int getNrfacture() {
		return nrfacture;
	}
	public void setNrfacture(int nrfacture) {
		this.nrfacture = nrfacture;
	}
    

   
}