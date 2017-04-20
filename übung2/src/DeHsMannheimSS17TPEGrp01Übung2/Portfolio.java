package DeHsMannheimSS17TPEGrp01�bung2;

import java.util.ArrayList;

/**
 * 
 * @author sedat
 *
 */
public class Portfolio {

	ArrayList<Verm�gensgegenstand> vmgs = new ArrayList<Verm�gensgegenstand>();
	protected long summe[] = new long[5];
	protected byte j = 0;
	protected String typ1[] = { "Aktie", "Aktie", "A.fonds", "Immo", "F.geld", "Option", "Option", "Option", "Option" };
	protected String typ2[] = { "Aktie", "Aktie", "Aktie", "Aktie", "A.fonds", "A.fonds", "S.brief", "F.geld" };

	/**
	 * 
	 * @param e
	 *            : gibt an was es draufgelegt wird
	 */
	protected void addVmg(Verm�gensgegenstand e) {
		vmgs.add(e);
	}

	/**
	 * 
	 * @return : gibt den allen zusammen gez�hlten wert an
	 */
	protected long berecheWert() {
		j++;
		summe[j] = 0;
		for (int i = 0; i < vmgs.size(); i++) {
			summe[j] = summe[j] + (vmgs.get(i).aktuellerPreis * vmgs.get(i).anzahl);
		}
		return summe[j];
	}
/**
 * @see gibt die Tabelle aus f�r portfolio 1
 */
	protected void listVGM1() {
		System.out.println("Typ\t\tName\t\tAnzahl\t\tSt�ckpreis");
		for (int i = 0; i < vmgs.size(); i++) {
			System.out.println(typ1[i] + "\t\t" + vmgs.get(i).name + "\t\t" + vmgs.get(i).anzahl + "\t\t"
					+ vmgs.get(i).aktuellerPreis);
		}
	}
/**
 * @see gibt die Tabelle aus f�r portfolio 2 
 */
	protected void listVGM2() {
		System.out.println("Typ\t\tName\t\tAnzahl\t\tSt�ckpreis");
		for (int i = 0; i < vmgs.size(); i++) {
			System.out.println(typ2[i] + "\t\t" + vmgs.get(i).name + "\t\t" + vmgs.get(i).anzahl + "\t\t"
					+ vmgs.get(i).aktuellerPreis);
		}
	}

	/**
	 * 
	 * @return gibt den gewinn oder den verlust an
	 */
	protected long gewinnVerlustAmEnde() {
		long endSumme = summe[j] - summe[1];
		return endSumme;
	}

}