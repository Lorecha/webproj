package domaine;

import java.util.ArrayList;

/** 
 *  La classe Domaine.Voyage est la classe m?tier.
 *  Cette classe est renvoy?e dans une liste par Domaine.AgenceVoyageService.
 */
public class Voyage {

  private int numeroVoyage;
  private Boolean statut;
  public double prix;
  public ArrayList <Formule> Formule;
  public ArrayList<Reservation>  mesReservations;
  private Destination destination;

  
  /**
 * 
 */


public Voyage(int numeroVoyage,  double prix, Destination destination) {
    this.numeroVoyage = numeroVoyage;
    this.prix = prix;
    this.destination = destination;
  }

  /**
 * 
 */
public Voyage() {
	
}

public  void addReservation(Reservation reservation) {
    this.mesReservations.add(reservation) ;
  }
  @Override
  public String toString() {
    return "Voyage{" +
            "numeroVoyage=" + numeroVoyage +
            ", statut=" + statut +
            ", prix=" + prix +
            ", Formule=" + Formule +
            " destination=" + destination +
            '}';
  }
}