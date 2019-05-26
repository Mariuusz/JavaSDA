package pl.sda.observerObservable.zad5;

import java.util.Observable;
import java.util.Observer;

public class ServiceDepartment implements Observer {
    public ServiceDepartment() {
    }

    private void handleRequest(Request request) {
        if (request.getType() == RequestType.SERVICE) {
            try {
                System.out.println("New request in service dpt: " + request);

                // Write to database
                Database.INSTANCE.appendServiceRequest(DatabaseType.DB_USERS.getDbName(), request);
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