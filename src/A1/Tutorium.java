package A1;

public class Tutorium extends Kurs {

    Studi studiTutor;
    Mitarbeiter mitarbeiterTutor;

    public Tutorium(int kursnummer, String name, int maxanzahlStudis, Studi tutor) {
        super(kursnummer, name, maxanzahlStudis);
        this.studiTutor = tutor;
    }

    public Tutorium(int kursnummer, String name, int maxanzahlStudis, Mitarbeiter tutor) {
        super(kursnummer, name, maxanzahlStudis);
        this.mitarbeiterTutor = tutor;
    }


}
