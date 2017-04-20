package DeHsMannheimSS17TPEGrp01�bung2;
/**
 * 
 * @author sedat
 *
 */
public class PutOption extends Option implements Handelbar {
	public long gewinnVerlust2 = (kaufpreis + aus�bungspreis) - aktuellerPreis;
/**
 * 
 * @param name : name des Wert st�cks
 * @param kaufpreis : wie viel es kostet
 * @param kaufdatum : wann es erstellt wurde
 * @param anzahl : wie viel es davon gibt
 * @param aus�bungspreis : was man davon profitieren kann
 */
	public PutOption(String name, long kaufpreis, String kaufdatum, long anzahl, long aus�bungspreis) {
		super(name, kaufpreis, kaufdatum, anzahl, aus�bungspreis);

	}

	public void setKurs(long kurs) {
		aktuellerPreis = kurs;

	}

}
