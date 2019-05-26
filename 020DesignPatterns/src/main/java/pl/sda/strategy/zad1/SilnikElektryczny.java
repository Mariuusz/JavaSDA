package pl.sda.strategy.zad1;

public class SilnikElektryczny implements INaped {
    @Override
    public int getPoborPraduSilnika() {
        return 10;
    }

    @Override
    public int getPoborPaliwa() {
        return 0;
    }

    @Override
    public int getMocSilnika() {
        return 30;
    }

}
