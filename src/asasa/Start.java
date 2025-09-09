package asasa;

public class Start {
    public static void main(String[] args) {
        Uczen uczen = new Uczen("Lizak","Maciek");
        System.out.println(uczen);
        System.out.println(Uczen.getLiczbaUczniow());
        Uczen uczen2 = new Uczen("WAli","Mural");
        System.out.println(uczen2);
        System.out.println(Uczen.getLiczbaUczniow());
        Uczen uczen3 = new Uczen("Szatyn","Senpai");
        System.out.println(uczen3);
        System.out.println(Uczen.getLiczbaUczniow());
    }
}
