public void wypozyczKsiazke(String tytul, Czytelnik czytelnik) {
    Ksiazka ksiazka = znajdzKsiazkePoTytule(tytul);

    if (ksiazka != null) {
        if (ksiazka.isDostepna()) {
            ksiazka.wypozycz();
            czytelnik.zwiekszLiczbeWypozyczen();
        } else {
            System.out.println("Ksiazka jest juz wypozyczona.");
        }
    } else {
        System.out.println("Nie znaleziono ksiazki.");
    }
}

public void zwrocKsiazke(String tytul, Czytelnik czytelnik) {
    Ksiazka ksiazka = znajdzKsiazkePoTytule(tytul);

    if (ksiazka != null) {
        if (!ksiazka.isDostepna()) {
            ksiazka.zwroc();
            czytelnik.zmniejszLiczbeWypozyczen();
        } else {
            System.out.println("Ksiazka juz jest dostepna.");
        }
    } else {
        System.out.println("Nie znaleziono ksiazki.");
    }
}