public class Main {
    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("Wiedzmin", "Andrzej Sapkowski", 320, true);
        Ksiazka k2 = new Ksiazka("Lalka", "Boleslaw Prus", 680, true);
        Ksiazka k3 = new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", 340, true);

        Czytelnik c1 = new Czytelnik("Jan", "Kowalski", 1001, 0);

        Biblioteka biblioteka = new Biblioteka(10);

        biblioteka.dodajKsiazke(k1);
        biblioteka.dodajKsiazke(k2);
        biblioteka.dodajKsiazke(k3);

        System.out.println("\n=== Dostepne ksiazki ===");
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("\n=== Wypozyczenie ===");
        biblioteka.wypozyczKsiazke("Lalka", c1);

        System.out.println("\n=== Po wypozyczeniu ===");
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("\n=== Zwrot ===");
        biblioteka.zwrocKsiazke("Lalka", c1);

        System.out.println("\n=== Po zwrocie ===");
        biblioteka.wypiszDostepneKsiazki();
    }
}