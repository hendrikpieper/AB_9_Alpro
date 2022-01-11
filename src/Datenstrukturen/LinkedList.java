package Datenstrukturen;

import A1.Kurs;

public class LinkedList{

    LinkedListElement head;

    static class LinkedListElement{
        Kurs kurs;
        LinkedListElement next;

        LinkedListElement(Kurs neuerkurs){
            kurs = neuerkurs;
            next = null;
        }
    }


    public LinkedList einfuegen(LinkedList list, Kurs daten) {
        LinkedListElement neu = new LinkedListElement(daten);
        neu.next = null;

        if(list.head == null){
            list.head = neu;
        }
        else{
            LinkedListElement letztes = list.head;
            while(letztes.next != null){
                letztes = letztes.next;
            }
            letztes.next = neu;
        }
        return list;
    }

    public LinkedList loeschen(LinkedList list, Kurs zulöschen) {
        LinkedListElement letztes = list.head;
        while(letztes.next.kurs != zulöschen){
            letztes = letztes.next;
        }
        LinkedListElement naechstes = letztes.next;
        letztes.next = naechstes.next;

        return list;
    }


    public boolean suche(LinkedList list, LinkedListElement kurs) {
        boolean gefunden = false;
        LinkedListElement letztes = list.head;
        while(letztes.next != null){
            if(letztes == kurs){
                gefunden = true;
            }
        }
        return gefunden;
    }


    public int anzahlWerte(LinkedList list, Kurs kurs) {
        int gefunden = 0;
        LinkedListElement letztes = list.head;
        while(letztes != null){
            if(letztes.kurs == kurs){
                gefunden += 1;
            }
            letztes = letztes.next;
        }
        return gefunden;
    }
}
