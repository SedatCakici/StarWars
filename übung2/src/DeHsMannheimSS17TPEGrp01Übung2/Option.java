package DeHsMannheimSS17TPEGrp01�bung2;
/**
 * 
 * @author sedat
 *
 */
public abstract class Option extends Verm�gensgegenstand {
public long aus�bungspreis;
/**
 * 
 * @param name : name der Wert st�cks
 * @param kaufpreis : wie vie es kostet
 * @param kaufdatum : wann es erstellt wurde
 * @param anzahl : wie viel es davon gibt
 * @param aus�bungspreis : was man daf�r einsetzt
 */
public Option(String name, long kaufpreis, String kaufdatum, long anzahl, long aus�bungspreis) {
    super(name, kaufpreis, kaufdatum,anzahl);
    this.aus�bungspreis = aus�bungspreis;
}


}