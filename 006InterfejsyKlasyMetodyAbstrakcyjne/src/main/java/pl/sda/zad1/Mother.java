package pl.sda.zad1;

public class Mother implements IFamilyMember {
    private String name;

    public Mother(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println(this.name);
        System.out.println("I'm a mother");
    }

    @Override
    public boolean isAdult() {
        return true;
    }
}
