package domaine;

public abstract class Personne {
   private String civilite;
   private String nom;
   private String prenom;
   private String email;
  public Adresse adresse;

  public Personne(String civilite, String nom, String prenom, String email, Adresse myAdresse) {
    this.civilite = civilite;
    this.nom = nom;
    this.prenom = prenom;
    this.email = email;
    this.adresse = myAdresse;
  }
  public Personne(String civilite, String nom, String prenom, String email, String rue, String ville, String codepostal, String region, String pays) {
      this.civilite = civilite;
      this.nom = nom;
      this.prenom = prenom;
      this.email = email;
      this.adresse.setRue(rue);
      this.adresse.setVille(ville);
      this.adresse.setCodePostal(codepostal);
      this.adresse.setRegion(region);
      this.adresse.setPays(pays);
  }
}