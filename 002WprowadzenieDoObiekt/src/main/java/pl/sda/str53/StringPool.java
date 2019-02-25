package pl.sda.str53;

//Jak przechowywane są zmienne w Javie?
//        Stos i sterta
//        •Oba elementy zajmują pamięć RAM maszyny
//        •Sterta służy do przechowywania obiektów
//        •Stos służy do przechowywania referencji oraz typów prymitywnych
//        •W stercie dodatkowo utworzony jest ‚String pool’, który służy do przechowywania literałów dla typu String, dlatego:
//              •String str= „Ala”, String str2 = „Ala”
//              •str==str2 zwróci prawdę, natomiast dla :
//              •String str= newString(„Ala”), String str2 = newString(„Ala”)
//              •str==str2 zwróci fałsz

public class StringPool {
    public static void main(String[] args) {
        String str = "Ala";
        String str2 = "Ala";
        System.out.println(str==str2);

        String str3 = new String("Ala");
        String str4 = new String("Ala");
        System.out.println(str3==str4);
    }

}
