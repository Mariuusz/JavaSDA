package pl.sda.str20;

public interface Grzeje {
    double pobierzTemp();
    void ogrzej();

    default void wyswietlTemp(){

        System.out.println("Aktualna temperatura w pomieszczeniu wynosi:" + pobierzTemp() + " stopni Celsjusza");
    }
}
