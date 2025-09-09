package asasa;

public class Uczen extends OSoba {
    private static int liczbaUczniow = 0;
    private int nrUcznia;

    public Uczen(String nazwisko, String imie) {
        super(nazwisko, imie);
        liczbaUczniow++;
        nrUcznia=liczbaUczniow;
    }

    public int getNrUcznia() {
        return nrUcznia;
    }

    public void setNrUcznia(int nrUcznia) {
        this.nrUcznia = nrUcznia;
    }

    public static int getLiczbaUczniow() {
        return liczbaUczniow;
    }

    public static void setLiczbaUczniow(int liczbaUczniow) {
        Uczen.liczbaUczniow = liczbaUczniow;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "nrUcznia=" + nrUcznia +
                "Imie=" + getImie() +
                "Nazwisko=" + getNazwisko() +
                '}';
    }
}
