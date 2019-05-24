package pl.sda.amen.zad1;

public class Student {
    private int nrIndeksu;
    private String imie;
    private String nazwisko;
    private Plec płeć;

    public Student(int nrIndeksu, String imie, String nazwisko, Plec płeć) {
        this.nrIndeksu = nrIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.płeć = płeć;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nrIndeksu=" + nrIndeksu +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", płeć=" + płeć +
                '}';
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Plec getPłeć() {
        return płeć;
    }

    public void setPłeć(Plec płeć) {
        this.płeć = płeć;
    }
}
