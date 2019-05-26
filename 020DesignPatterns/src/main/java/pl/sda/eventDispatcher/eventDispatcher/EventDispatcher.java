package pl.sda.eventDispatcher.eventDispatcher;

import org.apache.commons.lang3.ClassUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EventDispatcher {
    private static EventDispatcher ourInstance = new EventDispatcher();

    public static EventDispatcher getInstance() {
        return ourInstance;
    }

    private Map<Class<?>, List<Object>> listOfRegisteredObjects = new HashMap<>();
    private ExecutorService watek = Executors.newFixedThreadPool(3);

    private EventDispatcher() {
    }

    public void register(Object o) {
        List<Class<?>> interfejsyImplementowanePrzezO = ClassUtils.getAllInterfaces(o.getClass());

        // lista interfejsów implementowanych przez obiekt
        for (Class<?> interfejs : interfejsyImplementowanePrzezO) {
            List<Object> objects;
            // jeśli pod danym interfejsem znajduje sie juz obiekt (lista obiektów)
            if (listOfRegisteredObjects.containsKey(interfejs)) {
                // wyciągam tą liste
                objects = listOfRegisteredObjects.get(interfejs);
            } else {
                // tworze nową
                objects = new ArrayList<>();
            }
            // dodaje obiekt do listy
            objects.add(o);
            // umieszczam listę w mapie
            listOfRegisteredObjects.put(interfejs, objects);
        }
    }

    public <T> List<T> pobierzObiektyImplementujaceInterfejs(Class<T> interfejs) {
        return (List<T>) listOfRegisteredObjects.get(interfejs);
    }

    public void rozeslij(final IEvent zdarzenie) {
        //
        watek.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    zdarzenie.execute();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}