package domaine;

import java.util.Date;
import java.util.Vector;
import java.time.LocalDateTime;
/** 
 *  La prestation comprend :
 *  - date de d?part
 *  - date d'arriv?e
 *  - prix HT
 *  - compagnie
 */
public abstract class Prestation {

  private Date dateDepart;
  private Date dateArrivee;
  private double prixHT;
/**
 * @param dateDepart
 * @param dateArrivee
 * @param prixHT
 */
public Prestation(Date dateDepart, Date dateArrivee, double prixHT) {

	this.dateDepart = dateDepart;
	this.dateArrivee = dateArrivee;
	this.prixHT = prixHT;
}


  
}