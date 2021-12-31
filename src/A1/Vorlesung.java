package A1;

import A1.Dozent;

public class Vorlesung extends Kurs {

    Dozent dozent;

    public Vorlesung(String name, int kursNummer, Dozent dozent) {
        super(kursNummer, name, 400);
        this.dozent = dozent;
    }
}
