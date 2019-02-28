package pl.sda.zad5;

//5. *Potrzebne będzie rozwiązanie zadania z poprzednich zajęć (ICzlonekRodziny oraz klasy implementujące ten interfejs).
// Stwórz metodę generyczną 'znajdźOjców:Father[]' która dla podanej tablicy obiektów IFamilyMember
// odnajduje wyłącznie ojców i umieszcza ich w tablicy, a następnie zwraca tą tablicę.

//public class Main {
//    public static void main(String[] args) {
//        IFamilyMember[] members = new IFamilyMember[4];
//
//        members[0] = new Father();
//        members[1] = new Father();
//        members[2] = new Father();
////        members[3] = new Father();
////        members[1] = new Mother();
////        members[2] = new Daughter();
//        members[3] = new Son();
//
//        for (IFamilyMember member : members) {
//            member.introduce();
//
//            if (member instanceof Father){
//                Father rzutowany = (Father) member;
//                rzutowany.screamAtSon();
//                ((Father) member).screamAtSon();
//            }
//        }
//
//        IFamilyMember member = new Father();
//    }
//}