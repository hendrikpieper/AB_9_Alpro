package A1;

import A1.Veranstalter;

public class Praktikum extends Kurs {
    Veranstalter[] veranstalter;
    int kapazitaetsgrenze;

    public Praktikum(String name, int kursNummer, Veranstalter[] veranstalter, int kapazitaetsgrenze) {
        super(kursNummer, name, kapazitaetsgrenze);
        this.veranstalter = veranstalter;
        this.kapazitaetsgrenze = kapazitaetsgrenze;
    }
}
