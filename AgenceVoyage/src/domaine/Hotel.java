package domaine;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Hotel extends Prestation {
  public String nomHotel;
  private int nrEtoiles;
  private ArrayList<Chambre> mesChambres;
  private Adresse adresse;

 
  /**
 * @param dateDepart
 * @param dateArrivee
 * @param prixHT
 */
public Hotel(Date dateDepart, Date dateArrivee, double prixHT) {
	super(dateDepart, dateArrivee, prixHT);
	// TODO Auto-generated constructor stub
}

public Hotel(Date dateDepart, Date dateArrivee, double prixHT,  String nom, int nrEtoile,String rue, String ville,String codepostal, String region, String pays) {
	super(dateDepart, dateArrivee, prixHT);
      this.nrEtoiles = nrEtoile;
      this.nomHotel=nom;
      this.adresse.setRue(rue);
      this.adresse.setVille(ville);
      this.adresse.setCodePostal(codepostal);
      this.adresse.setRegion(region);
      this.adresse.setPays(pays);    }

  public  void addChambre(Chambre chambre) {
    this.mesChambres.add(chambre) ;
  }
}