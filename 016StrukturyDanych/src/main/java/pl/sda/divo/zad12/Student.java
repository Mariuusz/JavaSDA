package pl.sda.divo.zad12;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
class Student {
    String imie;
    String nazwisko;
    int nrIndeksu;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(imie, student.imie) &&
                Objects.equals(nazwisko, student.nazwisko) &&
                Objects.equals(nrIndeksu, student.nrIndeksu);
    }

    @Override
    public int hashCode() {
        return nrIndeksu;
    }
}