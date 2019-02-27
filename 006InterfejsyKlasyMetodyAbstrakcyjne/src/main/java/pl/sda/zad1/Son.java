package pl.sda.zad1;

public class Son implements IFamilyMember {
    private String name;

    public Son(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println(this.name);
        System.out.println("who’s asking?");
    }

    @Override
    public boolean isAdult() {
        return false;
    }
}
