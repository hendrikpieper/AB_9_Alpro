package Datenstrukturen;

import A1.Kurs;

public class Main {
    public static void main(String[] args) {
        Kurs biologie = new Kurs(1, "biologie", 15);

        LinkedList neueListe = new LinkedList();
        neueListe = neueListe.einfuegen(neueListe, biologie);
        neueListe = neueListe.einfuegen(neueListe, biologie);
        int anzahl = neueListe.anzahlWerte(neueListe, biologie);
        System.out.println(anzahl);
        neueListe = neueListe.loeschen(neueListe, biologie);
        anzahl = neueListe.anzahlWerte(neueListe, biologie);
        System.out.println(anzahl);
    }
}
