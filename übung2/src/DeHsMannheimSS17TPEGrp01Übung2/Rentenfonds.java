package DeHsMannheimSS17TPEGrp01�bung2;

import java.util.ArrayList;
/**
 * 
 * @author sedat
 *
 */
public class Rentenfonds extends Fonds {
	public Rentenfonds(String name, long kaufpreis, String kaufdatum, long anzahl) {
		super("R.fonds", name, kaufpreis, kaufdatum, anzahl);
	}

	public ArrayList<Rentenpapier> anSammlungVonAktien = new ArrayList<Rentenpapier>();
	/**
	 * 
	 * @param e
	 */
	public void einenDraufLegen(Rentenpapier e) {
		anSammlungVonAktien.add(e);
	}
	/**
	 * 
	 * @param kurs
	 */
	public void setKurs(long kurs) {
		aktuellerPreis = kurs;
	}
}
