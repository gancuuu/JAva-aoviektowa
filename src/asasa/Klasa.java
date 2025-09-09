package asasa;

import java.util.ArrayList;

public class Klasa {
    private ArrayList<Uczen>uczniowie;
    private NAuczyciel wyhcowawca;

    public Klasa(NAuczyciel wyhcowawca) {
        this.wyhcowawca = wyhcowawca;
    }
    private void dodaj_ucznia(Uczen uczen){
        if(uczniowie.contains(uczen)){
            return;
        }
        else {
            uczniowie.add(uczen);
        }
    }

    @Override
    public String toString() {
        String listauczniow ="";

        for(Uczen uczen:uczniowie){
            listauczniow+=uczen+" /";
            System.out.println(listauczniow);
        }

        return "Klasa{" +
                "uczniowie=" + uczniowie +
                ", wyhcowawca=" + wyhcowawca +
                '}';
    }
}
