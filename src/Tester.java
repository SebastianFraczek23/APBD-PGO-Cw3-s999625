public class Tester extends Pracownik {
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko,
                  double stawkaBazowa, boolean czyAutomatyzujacy,
                  int liczbaScenariuszy) {

        super(idPracownika, imie, nazwisko, stawkaBazowa);

        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    public int getLiczbaScenariuszy() {
        return liczbaScenariuszy;
    }

    @Override
    public double obliczKosztMiesieczny() {
        double bonus = czyAutomatyzujacy ? 1200 : 500;
        return getStawkaBazowa() + bonus;
    }

    @Override
    public String przedstawSie() {
        return "Jestem testerem: " +
                getImie() + " " + getNazwisko() +
                ", scenariusze testowe: " + liczbaScenariuszy;
    }

    public void uruchomRaportTestow() {
        System.out.println("Uruchomiono raport testow.");
        System.out.println("Liczba scenariuszy: " + liczbaScenariuszy);
    }

    @Override
    public String toString() {
        return "Tester{" +
                "id='" + pobierzIdPracownika() + '\'' +
                ", imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                ", automatyzujacy=" + czyAutomatyzujacy +
                ", scenariusze=" + liczbaScenariuszy +
                ", koszt=" + obliczKosztMiesieczny() +
                '}';
    }
}