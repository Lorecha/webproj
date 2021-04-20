package domaine;

import java.util.ArrayList;


/** 
 *  La formule est associ? au voyage.
 */
public class Formule {
 private double prixTotal;
 public ArrayList<Prestation> mesPrestation ;


 public Formule(double prixTotal) {
  this.prixTotal = prixTotal;
 }
 public  void addPrestation(Prestation prestation) {
  this.mesPrestation.add(prestation) ;
 }
 //formule f1.addPrestation(Hotel);
 //formule f1.addPrestation(Avion);
}