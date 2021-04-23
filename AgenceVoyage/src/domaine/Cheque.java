package domaine;
import java.util.Date;
/**
 *  Completer les attributs avec informations figurant sur un ch?que
 */
public class Cheque extends MoyenPaiement {
 private String nrcheque;
 private double somme;
 private Date date;
/**
 * @param nrcheque
 * @param somme
 * @param date
 */
public Cheque(String nrcheque, double somme, Date date) {
	super();
	this.nrcheque = nrcheque;
	this.somme = somme;
	this.date = date;
}
public String getNrcheque() {
	return nrcheque;
}
public void setNrcheque(String nrcheque) {
	this.nrcheque = nrcheque;
}
public double getSomme() {
	return somme;
}
public void setSomme(double somme) {
	this.somme = somme;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
@Override
public String toString() {
	return "Cheque [nrcheque : " + nrcheque + ", somme: " + somme + ", date:" + date + ", banque=" + banque;
}

}