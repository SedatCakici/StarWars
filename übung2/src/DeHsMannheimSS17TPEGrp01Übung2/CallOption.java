package DeHsMannheimSS17TPEGrp01�bung2;

/**
 * 
 * @author sedat
 *
 */
public class CallOption extends Option implements Handelbar {
	public long gewinn = aktuellerPreis - (kaufpreis + aus�bungspreis);

	/**
	 * 
	 * @param name : name des Wertes
	 * @param kaufpreis  : wie viel es kostet
	 * @param kaufdatum : wann es angelegt wurde
	 * @param anzahl : wie viel es davon angelegt wurde
	 * @param aus�bungspreis   : gibt den ausge�bte preis an
	 */
	public CallOption(String name, long kaufpreis, String kaufdatum, long anzahl, long aus�bungspreis) {
		super(name, kaufpreis, kaufdatum, anzahl, aus�bungspreis);

	}

	/**
	 * @see setzt den kurs auf den aktuellen kaufpreis
	 */
	public void setKurs(long kurs) {
		aktuellerPreis = kurs;
	}

}
