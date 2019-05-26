package pl.sda.observerObservable.zad5;

import java.util.Observable;
import java.util.Observer;

public class Marketing implements Observer {

    public Marketing() {

    }

    private void handleRequest(Request request) {
        if (request.getType() == RequestType.MARKETING) {
            try {
                Order order = new Order(request);
                System.out.println("New order created: " + order);

                // Write to database
                Database.INSTANCE.saveToDatabase(DatabaseType.DB_ORDERS, order);
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.err.println("Invalid number of order parameters.");
            }
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Request) {
            Request request = (Request) arg;

            // handling request
            handleRequest(request);
        }
    }
}
