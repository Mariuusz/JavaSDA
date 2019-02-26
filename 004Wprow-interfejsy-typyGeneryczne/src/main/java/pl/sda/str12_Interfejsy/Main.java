package pl.sda.str12_Interfejsy;

public class Main {
    public static void main(String[] args) {
        Gitara gitara = new Gitara();
        Bęben bęben = new Bęben();
        Pianino pianino = new Pianino();

        gitara.graj();
        bęben.graj();
        pianino.graj();
    }
}
