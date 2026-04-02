public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    public void wypiszInfo() {
        System.out.println("Tytul: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Liczba stron: " + liczbaStron);
        System.out.println("Dostepna: " + (dostepna ? "tak" : "nie"));
        System.out.println();
    }

    public void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("Ksiazka \"" + tytul + "\" zostala wypozyczona.");
        } else {
            System.out.println("Ksiazka \"" + tytul + "\" nie jest dostepna.");
        }
    }

    public void zwroc() {
        if (!dostepna) {
            dostepna = true;
            System.out.println("Ksiazka \"" + tytul + "\" zostala zwrocona.");
        } else {
            System.out.println("Ksiazka \"" + tytul + "\" juz jest dostepna.");
        }
    }

    public String getTytul() {
        return tytul;
    }

    public boolean isDostepna() {
        return dostepna;
    }
}