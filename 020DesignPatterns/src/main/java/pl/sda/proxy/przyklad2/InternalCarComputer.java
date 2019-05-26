package pl.sda.proxy.przyklad2;

public class InternalCarComputer {
    private Car car;

    public InternalCarComputer(Car car) {
        this.car = car;
    }

    /**
     * Ta metoda została zaimplementowana jako przykład tego,
     * że w innych miejscach niż main (gdzie użyłem proxy)
     * dalej jest dostępna metoda switchLightsOn, która nie jest
     * dostępna przez proxy).
     */
    public void przyklad(){
        car.switchLightsOn();
    }


}