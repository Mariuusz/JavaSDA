package pl.sda.divo.zad13;


import lombok.AllArgsConstructor;

//Następnie zaimplementuj kilka klas implementujących ten interfejs
//class Kwadrat implements Figura:
//        getField();
//        getName();
@AllArgsConstructor
public class Kolo implements Figura {
    private final int promien;

    @Override
    public double getField() {
        return Math.PI * promien * promien;
    }

    @Override
    public String getName() {
        return "Koło";
    }
}