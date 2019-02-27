package pl.sda.zad1;

public class Father implements IFamilyMember {
    @Override
    public void introduce() {
        System.out.println("I am your father!");
    }

    @Override
    public boolean isAdult() {
        return true;
    }
    public void screamAtSon(){
        System.out.println("Son youre bad!");
    }
}