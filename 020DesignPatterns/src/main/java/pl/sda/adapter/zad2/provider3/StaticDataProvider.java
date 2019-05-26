package pl.sda.adapter.zad2.provider3;

import java.util.ArrayList;
import java.util.List;

public class StaticDataProvider {
    private List<Human> humanList;
    public StaticDataProvider() {
        humanList = new ArrayList<>();

        humanList.add(new Human(123, "Zią", "Yo" ));
        humanList.add(new Human(71223, "Gosia", "Kwaśny" ));
        humanList.add(new Human(1231, "Marian", "Goliwąs" ));
        humanList.add(new Human(1263, "Alf", "Goliwąs" ));
        humanList.add(new Human(7123, "Alfred", "Buzia" ));
        humanList.add(new Human(156, "Filip", "Oczy" ));
        humanList.add(new Human(42, "Aleksandra", "Śmieszny" ));
        humanList.add(new Human(13, "Aleksy", "Zabawny" ));
        humanList.add(new Human(68, "Alek", "Niezabawny" ));
    }

    public List<Human> getHumanList(){
        return humanList;
    }
}