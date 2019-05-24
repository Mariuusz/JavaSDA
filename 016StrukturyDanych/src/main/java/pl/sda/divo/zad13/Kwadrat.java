package pl.sda.divo.zad13;


import lombok.AllArgsConstructor;

//Następnie zaimplementuj kilka klas implementujących ten interfejs
//class Kwadrat implements Figura:
//        getField();
//        getName();
@AllArgsConstructor
public class Kwadrat implements Figura {
    private final int bok;

    @Override
    public double getField() {
        return bok * bok;
    }

    @Override
    public String getName() {
        return "Kwadrat";
    }
}