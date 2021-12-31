package A1;

public class Dozent extends Mitarbeiter {

    String fach;

    public Dozent(String name, int alter, String fach) {
        super(name, alter);
        this.fach = fach;
    }
}
