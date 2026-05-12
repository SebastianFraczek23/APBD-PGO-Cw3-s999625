public class Programista extends Pracownik {
    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String idPracownika, String imie, String nazwisko,
                        double stawkaBazowa, String glownyJezyk,
                        int liczbaRepozytoriow) {

        super(idPracownika, imie, nazwisko, stawkaBazowa);

        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    @Override
    public double obliczKosztMiesieczny() {
        return getStawkaBazowa() + liczbaRepozytoriow * 300;
    }

    @Override
    public String przedstawSie() {
        return "Jestem programista: " +
                getImie() + " " + getNazwisko() +
                ", glowny jezyk: " + glownyJezyk;
    }

    public void wypiszTechnologie() {
        System.out.println("Technologia: " + glownyJezyk);
        System.out.println("Repozytoria: " + liczbaRepozytoriow);
    }

    @Override
    public String toString() {
        return "Programista{" +
                "id='" + pobierzIdPracownika() + '\'' +
                ", imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                ", glownyJezyk='" + glownyJezyk + '\'' +
                ", repozytoria=" + liczbaRepozytoriow +
                ", koszt=" + obliczKosztMiesieczny() +
                '}';
    }
}