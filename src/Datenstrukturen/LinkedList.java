package Datenstrukturen;

import A1.Kurs;

public class LinkedList implements Speicherstrukturen{

    Kurs element;
    Kurs naechsterKurs;

    public LinkedList(Kurs kurs, Kurs naechsterKurs){
        this.element = kurs;
        this.naechsterKurs = naechsterKurs;
    }

    @Override
    public void einfuegen() {
        while(naechsterKurs != Kurs){
        }
    }

    @Override
    public void loeschen() {

    }

    @Override
    public boolean suche() {
        return false;
    }

    @Override
    public int anzahlWerte() {
        return 0;
    }
}
