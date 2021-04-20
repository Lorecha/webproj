package domaine;

/**
 *  Plusieurs voyageurs peuvent ?tre inscrits sur le m?me voyage (exemple famille).
 */
public class Voyageur extends Personne {
   /**
   *  num?ro de passeport ou de carte d'identit? (compos? de chiffres et de lettre donc on met par d?faut un type String)
   */
  private String numeroPieceIdentite;
  private int age;
  public Reservation  Reservation;

  public Voyageur(String civilite, String nom, String prenom, String email, Adresse myAdresse, String numeroPieceIdentite, int age, domaine.Reservation reservation) {
    super(civilite, nom, prenom, email, myAdresse);
    this.numeroPieceIdentite = numeroPieceIdentite;
    this.age = age;
    Reservation = reservation;
  }

 
}