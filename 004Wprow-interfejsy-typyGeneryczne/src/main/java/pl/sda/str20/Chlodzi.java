package pl.sda.str20;

public interface Chlodzi {
    double pobierzTemp();
    void schlodz();

    default void wyswietlTemp(){

        System.out.println("Aktualna temperatura w pomieszczeniu wynosi:" + pobierzTemp() + " stopni Celsjusza");
    }
}
