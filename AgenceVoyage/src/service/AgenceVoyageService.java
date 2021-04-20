package service;
import domaine.Voyage;
import java.util.ArrayList;

public class AgenceVoyageService {
ArrayList<Voyage> offres ;

  public AgenceVoyageService(ArrayList<Voyage> offres) 
  {
    this.offres = offres;
  }

  public ArrayList<Voyage> getOffres() {
    return offres;
  }

  public void setOffres(ArrayList<Voyage> offres) {
    this.offres = offres;
  }

  public AgenceVoyageService() {
  }

  public boolean reserver (Voyage voyage)
  
  {
	  return true;
  }
  
}
