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

public void reserver1(Client c) {
   Scanner sc= new Scanner(System.in);
   boolean authentifie = false;
   //apres 5 essaie on ferme la boucle
   int nrEssais=0;
   while (authentifie == false&& nrEssais < 5) {
      System.out.println("Introduisiez nom user et pasword");
      authentifie= c.authenitification(sc.next(), sc.next());
   }
  if (authentifie == true) {
      this.etatReservation =EtatsReservation.EnCours;
   /*   ArrayList<AgenceVoyageService>  offre = new ArrayList<AgenceVoyageService>();
     Iterator<AgenceVoyageService> it= offre.iterator();
     while (it.hasNext()){
        it.toString();
     }*/
     System.out.println("Quell voyage vous choisiez : ");

     //proposer le catalog

     AgenceVoyageService agence = new AgenceVoyageService();
     agence.getOffres().toString();
     for (Voyage v: agence.getOffres())
     {
        v.toString();
     }
     int numvoyage= sc.nextInt();
     for (Voyage v: agence.getOffres())
     {
        if(v.noumeroVoyage==numvoyage)
        {
           this.myVoyage=v;
        }
        Client cli=new Client(sc.next(), sc.next(), sc.next());
     }

     System.out.println("Combien des personnes voyage : ");
     int nrpers=sc.nextInt();
     int i=0;
          if (nrpers >= 0) {
        while (i < nrpers) {
           Voyageur  v = new Voyageur(sc.next(), sc.nextInt(),this ) ;
           listeVoyageur.add(v);

        }
        System.out.println(" Entrez le typer d'assuranece: 1 -Assurance Annulation 2- Autre");
        int typeAssurance= sc.nextInt();
        if (typeAssurance==1)
        {
           Contrat contrat= new Contrat();
           AssuranceAnnulation assurance = new AssuranceAnnulation( 100, contrat, this);
        }
        prixTotal = this.myAssurance.prix*nrpers;
        System.out.println("Choisiez  le mode de paiement");
        int mode=sc.nextInt();
        if (mode== 1) {  CB cb= new CB(sc.nextInt(), sc.next());
           {
              CB cb=new CB(sc.nextInt(),sc.next());
              if (Date.valueOf(CB.getDateExpiration().compareTo(new Date(System.currentTimeMillis()))) >0)
              {this.etatReservation=EtatsReservation.EnCours;
              myVoyage.mesReservations.add(this);

              //contacter la banque
               // verifier le solde
                 //payer(cb,prixTotal);

              }
           }
        }

     } else new Exception("nr icorect");



   }
 else new Exception("Authentification obligatoire");
}

}
//choisir l'offre
//choisir la liste de voyageur
//choisir l'assurance

