package pl.sda.adapter.zad2.provider2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDataProvider {
    private List<User> userList;

    public RandomDataProvider() {
        this.userList = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            userList.add(new User(
                    r.nextInt(),
                    UUID.randomUUID().toString().substring(r.nextInt(5), r.nextInt(10) + 5),
                    String.valueOf(r.nextLong()),
                    generateRandomDate()));
        }
    }

    private LocalDate generateRandomDate() {
        long minDay = LocalDate.of(1970, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2015, 12, 31).toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        return randomDate;
    }

    public List<User> getSystemUsersList() {
        return userList;
    }
}