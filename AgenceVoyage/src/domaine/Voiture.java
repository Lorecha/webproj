package domaine;

public class Voiture extends Prestation {
  /* {author=Laure, version=1.0}*/


  /** 
   *  cat?gorie de la voiture
   */
  private int classe;
  /* {author=Laure, version=1.0}*/

  public Voiture(int classe) {
    this.classe = classe;
  }
}