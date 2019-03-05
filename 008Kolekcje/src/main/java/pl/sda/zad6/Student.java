package pl.sda.zad6;

import java.util.ArrayList;
import java.util.List;

public class Student {
        private List<Double> listaOcenStudenta = new ArrayList<Double>();
        private String nrIndeksu;
        private String imie;
        private String nazwisko;

    public Student(String nrIndeksu, String imie, String nazwisko) {
//        this.listaOcenStudenta = listaOcenStudenta;
        this.nrIndeksu = nrIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public void dodajOcene(Double... oceny){
        for (Double ocena:oceny){
            listaOcenStudenta.add(ocena);
        }
    }

    public double sredniaStudenta(){
        double srednia =0;
        for (Double ocena:listaOcenStudenta){
            srednia += ocena;
        }
        return srednia/listaOcenStudenta.size();
    }

    public List<Double> getListaOcenStudenta() {
        return listaOcenStudenta;
    }

    public String getNrIndeksu() {
        return nrIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", nrIndeksu='" + nrIndeksu + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
