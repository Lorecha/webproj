package domaine;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import service.AgenceVoyageService;

public class Reservation {
  /* {author=Laure, version=1.0}*/


   private ArrayList<Voyageur> listeVoyageur;
   private int numeroReservation;
   private EtatsReservation etatReservation;
   public Client  myClient;
   public Assurance  myAssurance;
   public Voyage  myVoyage;
  public double prixTotal=0;


}


//choisir l'offre
//choisir la liste de voyageur
//choisir l'assurance

