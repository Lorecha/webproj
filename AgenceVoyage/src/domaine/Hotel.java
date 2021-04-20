package domaine;

import java.util.ArrayList;

public class Hotel extends Prestation {



  public String nomHotel;
  private int nbEtoiles;
  private ArrayList<Chambre> mesChambres;
  private Adresse adresse;

  public Hotel(String nomHotel, int nbEtoiles,  Adresse adresse) {
    this.nomHotel = nomHotel;
    this.nbEtoiles = nbEtoiles;
    this.adresse = adresse;
  }
  public  void addChambre(Chambre chambre) {
    this.mesChambres.add(chambre) ;
  }
}