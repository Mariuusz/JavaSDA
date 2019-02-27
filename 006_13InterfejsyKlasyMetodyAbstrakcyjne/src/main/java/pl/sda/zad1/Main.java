package pl.sda.zad1;

//        f.	Stwórz w mainie kilka instancji powyższych klas. Przechowaj je w tablicy,
//              a następnie iteruj i wypisuj w kolejnych liniach ich metody ‘przedstawSie()’ oraz “jestDorosły”

public class Main {
    public static void main(String[] args) {
        IFamilyMember[] members = new IFamilyMember[4];

        members[0] = new Father();
//        members[1] = new Father();
//        members[2] = new Father();
//        members[3] = new Father();
        members[1] = new Mother("Joana");
        members[2] = new Daughter("Ori");
        members[3] = new Son("Jelph");

        for (IFamilyMember member : members) {
            member.introduce();

            if (member instanceof Father){
                Father rzutowany = (Father) member;
                rzutowany.screamAtSon();
                ((Father) member).screamAtSon();
            }
        }

        IFamilyMember member = new Father();
    }
}