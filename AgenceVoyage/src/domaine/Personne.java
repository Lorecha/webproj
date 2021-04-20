package domaine;

public abstract class Personne {
   private String civilite;
   private String nom;
   private String prenom;
   private String email;
  public Adresse  myAdresse;

  public Personne(String civilite, String nom, String prenom, String email, Adresse myAdresse) {
    this.civilite = civilite;
    this.nom = nom;
    this.prenom = prenom;
    this.email = email;
    this.myAdresse = myAdresse;
  }

}