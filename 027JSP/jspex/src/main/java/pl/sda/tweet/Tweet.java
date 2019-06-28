package pl.sda.tweet;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Tweet {

    private static int counter = 0;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private int id;
    private String title;
    private String text;
    private LocalDateTime created;
    private boolean pinned;

    /**
     * Kostruktor wykorzystywany do wyciagania indeksu w liscie tweetow,
     * @see TweetDB#getById(int)
     *
     * Dostep pakietowy
     *
     * @param id
     */
    Tweet(int id) {
        this.id = id;
        this.created = LocalDateTime.now();
    }

    /**
     * Konstruktor wykorzystywany do tworzenia tweetow
     *
     * @param title
     * @param text
     * @param pinned
     */
    public Tweet(String title, String text, boolean pinned) {
        this.id = ++counter;
        this.title = title;
        this.text = text;
        this.pinned = pinned;
        this.created = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public String getCreatedFormatted() {
        return formatter.format(created);
    }

    public boolean isPinned() {
        return pinned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tweet tweet = (Tweet) o;
        return id == tweet.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", created=" + created.format(formatter) +
                ", pinned=" + pinned +
                '}';
    }
}
