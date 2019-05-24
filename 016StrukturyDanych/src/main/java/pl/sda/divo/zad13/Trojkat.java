package pl.sda.divo.zad13;

import lombok.AllArgsConstructor;

//Następnie zaimplementuj kilka klas implementujących ten interfejs
//class Kwadrat implements Figura:
//        getField();
//        getName();
@AllArgsConstructor
public class Trojkat implements Figura {
    private final int podstawa;
    private final int wysokosc;

    @Override
    public double getField() {
        return (podstawa * wysokosc) / 2;
    }

    @Override
    public String getName() {
        return "Trójkąt";
    }
}