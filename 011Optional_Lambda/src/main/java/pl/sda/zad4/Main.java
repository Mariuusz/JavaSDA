package pl.sda.zad4;

//4*. Zamien poniższy kod:
//        List<Album> favs = new ArrayList<>();
//        for (Album a : albums) {
//        boolean hasFavorite = false;
//        for (Track t : a.tracks) {
//        if (t.rating >= 4) {
//        hasFavorite = true;
//        break;
//        }
//        }
//        if (hasFavorite)
//        favs.add(a);
//        }
//        Collections.sort(favs, new Comparator<Album>() {
//public int compare(Album a1, Album a2) {
//        return a1.name.compareTo(a2.name);
//        }});
//        ..na kod z wykorzystaniem streamów.

public class Main {
}

//favs.stream().filter(u -> u.rating >= 4).collect(Collectors.toList());
