package pl.sda.zad3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class PKP {
    private List<Pociag> pkp = new ArrayList<>();

    public PKP() {
    }

    public PKP(List<Pociag> pkp) {
        this.pkp = pkp;
    }

    public void wypiszWszystkiePociągi(){
        pkp.stream()
                .forEach(pociag -> System.out.println(pociag));
    }
    public void wypiszWszystkieEkonomicznePociągi(){
        pkp.stream()
                .filter(pociag -> pociag.getKlasa()==KlasaPociagu.EKONOMIA)
                .forEach(pociag -> System.out.println(pociag));
    }
    public List<Pociag> zwróćPociągiKlasy(KlasaPociagu klasa){
        return pkp.stream()
                .filter(pociag -> pociag.getKlasa() == klasa)
                .collect(Collectors.toList());
    }
    public Optional<Pociag> zwróćNajbardziejOpóźniony(){
        Optional<Pociag> pociag = pkp.stream()
                .sorted((o1, o2) -> Double.compare(o2.getMaxOpóźnienie(),o1.getMaxOpóźnienie()))
                .findFirst();
        return pociag;
    }
    public List<Pociag> zwróć3NajbardziejOpóźnione(){
        return pkp.stream()
                .sorted((o1, o2) -> Double.compare(o2.getMaxOpóźnienie(),o1.getMaxOpóźnienie()))
                .limit(3)
                .collect(Collectors.toList());
    }
    public Optional<Pociag> zwróćNajbardziejOpłacalny(){
        Optional<Pociag> pociag = pkp.stream()
                .sorted((o1, o2) -> Double.compare(o1.getCenaPodróży()/o1.getDługośćPodróży(),o2.getCenaPodróży()/o2.getDługośćPodróży()))
                .findFirst();
        return pociag;
    }
    public List<Pociag> zwróć3NajbardziejOpłacalne(){
        return pkp.stream()
                .sorted((o1, o2) -> Double.compare(o1.getCenaPodróży()/o1.getDługośćPodróży(),o2.getCenaPodróży()/o2.getDługośćPodróży()))
                .limit(3)
                .collect(Collectors.toList());
    }
    public void wypiszPociągiPosortowanymiNumeramiPociągu(){
        pkp.stream()
                .sorted((o1, o2) -> Double.compare(o1.getNumerPociągu(),o2.getNumerPociągu()))
                .forEach(pociag -> System.out.println(pociag));
    }
//        - zwróćWszystkieDostępneKlasyPociągów():Set<KlasaPociągu>
//        (wykorzystaj mapowanie oraz zbieraj [collect] do zbioru)
    public Set<KlasaPociagu> zwróćWszystkieDostępneKlasyPociągów(){
        return pkp.stream()
                .map(pociag -> pociag.getKlasa())
                .collect(Collectors.toSet());
    }
    public List<Pociag> zwróćKlasyBiznesZSypialnianymi(){
        return pkp.stream()
                .filter(pociag -> pociag.getKlasa()==KlasaPociagu.BIZNES && pociag.isCzyPosiadaWagonSypialny()==true)
                .collect(Collectors.toList());
    }
}
