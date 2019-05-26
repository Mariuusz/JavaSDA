package pl.sda.observerObservable.zad5;

//import com.sun.corba.se.impl.orb.DataCollectorBase;

import javax.xml.crypto.Data;
import java.awt.image.DataBuffer;
import java.util.Observable;

public class WebService extends Observable {

    public WebService() {
        addObserver(new Marketing());
        addObserver(new ServiceDepartment());
    }

    public void handleRequest(Request req) {
        System.out.println("Request arrived: " + req);

        // writing requests to database
        Database.INSTANCE.saveToDatabase(DatabaseType.DB_REQUESTS, req);

        // notify observers
        setChanged();
        notifyObservers(req);
    }
}