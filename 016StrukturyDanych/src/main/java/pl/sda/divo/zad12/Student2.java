package pl.sda.divo.zad12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
@AllArgsConstructor
@ToString
public class Student2 {
    private final String imie;
    private final String nazwisko;
    private final Integer nrIndeksu;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return Objects.equals(imie, student2.imie) &&
                Objects.equals(nazwisko, student2.nazwisko) &&
                Objects.equals(nrIndeksu, student2.nrIndeksu);
    }

    @Override
    public int hashCode() {
        return nrIndeksu;
    }
}