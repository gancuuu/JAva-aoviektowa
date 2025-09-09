package asasa;

public class NAuczyciel extends OSoba {
    private String przedmiot;

    public NAuczyciel(String nazwisko, String imie,String przedmiot) {
        super(nazwisko, imie);
        this.przedmiot=przedmiot;
    }

    @Override
    public String toString() {
        return "NAuczyciel{" +
                "Imie='" + getImie() + '\'' +
                "NAzwisko='" + getNazwisko() + '\'' +
                "przedmiot='" + przedmiot + '\'' +
                '}';
    }
}
