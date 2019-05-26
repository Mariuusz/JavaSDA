package pl.sda.strategy.zad1;

public class SilnikSpalinowy implements INaped {
    @Override
    public int getPoborPraduSilnika() {
        return -10;
    }

    @Override
    public int getPoborPaliwa() {
        return 10;
    }

    @Override
    public int getMocSilnika() {
        return 80;
    }
}
