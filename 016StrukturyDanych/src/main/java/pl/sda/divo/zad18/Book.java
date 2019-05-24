package pl.sda.divo.zad18;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Book {
    String title;
    String price;

    @Override
    public String toString() {
        return "'" + title + "' - " + price;
    }
}
