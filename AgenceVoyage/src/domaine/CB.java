package domaine;



public class CB extends MoyenPaiement {
  private int numeroCB;
  private String dateExpiration;

  public CB(int numeroCB, String dateExpiration) {
	 super();
    this.numeroCB = numeroCB;
    this.dateExpiration = dateExpiration;
  }

  public int getNumeroCB() {
    return numeroCB;
  }

  public void setNumeroCB(int numeroCB) {
    this.numeroCB = numeroCB;
  }


}