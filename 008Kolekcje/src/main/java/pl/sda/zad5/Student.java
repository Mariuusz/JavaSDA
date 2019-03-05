package pl.sda.zad5;

public class Student {
        private int nrIndeksu;
        private String imie;
        private String nazwisko;
        private Plec plec;

    public Student(int nrIndeksu, String imie, String nazwisko, Plec plec) {
        this.nrIndeksu = nrIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }

    public Plec getPlec() {
        return plec;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nrIndeksu=" + nrIndeksu +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec=" + plec +
                '}';
    }
}
