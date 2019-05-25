package pl.sda.zad1;

//Napiszmy prostą aplikację, która utworzy 10 wątków, z których każdy będzie miał za zadanie
// jedynie wyświetlenie swojego przypisanego ID, a następnie wstrzymanie swojego działania
// na krótki okres czasu – i tak w kółko.

public class MyRun implements Runnable{

    private int id;

    public MyRun(int id) {
        this.id = id;
    }

    public void run() {
        while (true){
            System.out.println("Wątek: " + id);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
