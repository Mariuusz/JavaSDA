package pl.sda.zad1;

public class Daughter implements IFamilyMember {
    private String name;

    public Daughter(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println(this.name);
        System.out.println("I am daughter ;)");
    }

    @Override
    public boolean isAdult() {
        return false;
    }
}
