package pl.sda.builder.zad0;

public class Main {
    public static void main(String[] args) {
        Hero nowyhero = new Hero.Builder().setM_hp(23).setM_height(23)
                .setM_legacy("something").setM_surname("set").create();
    }
}