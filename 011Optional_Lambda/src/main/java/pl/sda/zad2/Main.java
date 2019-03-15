package pl.sda.zad2;

//2. Stwórz klasę Programmer, która ma klasę Person jako pole. Poza tym, posiada listę języków,
// którymi się posługuje. Mogą być one reprezentowane przez klasę String.
//        Mając listę programistów i korzystając ze streamów:
//        a) uzyskaj listę programistów, którzy są mężczyznami
//        b) uzyskaj listę niepełnoletnich programistów (obydwóch płci), którzy piszą w Cobolu
//        c) uzyskaj listę programistów, którzy znają więcej, niż jeden język programowania
//        d) uzyskaj listę programistek, które piszą w Javie i Cpp
//        e) uzyskaj listę męskich imion
//        f) uzyskaj set wszystkich języków opanowanych przez programistów
//        g) uzyskaj listę nazwisk programistów, którzy znają więcej, niż dwa języki
//        h) sprawdź, czy istnieje chociaż jedna osoba, która nie zna żadnego języka
//        i)* uzyskaj ilość wszystkich języków opanowanych przez programistki

import pl.sda.zad1.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jacek","Kowalski",18,true);
        Person person2 = new Person("Jacek","Górski",15,true);
        Person person3 = new Person("Andżelika","Dżoli",25,false);
        Person person4 = new Person("Wanda","Ibanda",12,false);
        Person person5 = new Person("Marek","Marecki",17,true);
        Person person6 = new Person("Johny","Brawo",25,true);
        Person person7 = new Person("Stary","Pan",80,true);
        Person person8 = new Person("Newbie","Noob",12,true);
        Person person9 = new Person("Newbies","Sister",19,false);

        List<String> languages1 = Arrays.asList("Java;Cobol;Cpp;Lisp".split(";"));
        List<String> languages2 = Arrays.asList("Java;Lisp".split(";"));
        List<String> languages3 = Arrays.asList("Java;Cobol;Cpp;Lisp;C#".split(";"));
        List<String> languages4 = Arrays.asList("C#;C;Cpp".split(";"));
        List<String> languages5 = Arrays.asList("Java;Assembler;Scala;Cobol".split(";"));
        List<String> languages6 = Arrays.asList("Java;Scala".split(";"));
        List<String> languages7 = Arrays.asList("C#;C".split(";"));
        List<String> languages8 = Collections.emptyList();
        List<String> languages9 = Arrays.asList("Java");

        Programmer programmer1 = new Programmer(person1,languages1);
        Programmer programmer2 = new Programmer(person2,languages2);
        Programmer programmer3 = new Programmer(person3,languages3);
        Programmer programmer4 = new Programmer(person4,languages4);
        Programmer programmer5 = new Programmer(person5,languages5);
        Programmer programmer6 = new Programmer(person6,languages6);
        Programmer programmer7 = new Programmer(person7,languages7);
        Programmer programmer8 = new Programmer(person8,languages8);
        Programmer programmer9 = new Programmer(person9,languages9);

        List<Programmer> programmers = Arrays.asList(programmer1,programmer2,programmer3,programmer4,
                         programmer5,programmer6,programmer7,programmer8,programmer9);

//        System.out.println(maleProghrammer(programmers));
//        System.out.println(minorCobol(programmers));
//        System.out.println(moreThanOneLanguage(programmers));

        Main main = new Main();
//        System.out.println(main.famaleWhosWriteInJavaAndCpp(programmers));
//        System.out.println(main.getMaleNames(programmers));
//        System.out.println(main.setLanguages(programmers));
        System.out.println(main.lastNameMoreThenTwoLanguages(programmers));



    }
//        a) uzyskaj listę programistów, którzy są mężczyznami
    public static List<Programmer> maleProghrammer(List<Programmer> programmers){
        return programmers.stream()
                .filter(programmer -> programmer.getPerson().isMale())
                .collect(Collectors.toList());
    }
//        b) uzyskaj listę niepełnoletnich programistów (obydwóch płci), którzy piszą w Cobolu
    public static List<Programmer> minorCobol(List<Programmer> programmers){
        return programmers.stream()
                .filter(programmer -> programmer.getPerson().getAge() < 18 && programmer.getLanguages().contains("Cobol"))
                .collect(Collectors.toList());
    }
//        c) uzyskaj listę programistów, którzy znają więcej, niż jeden język programowania
    public static List<Programmer> moreThanOneLanguage(List<Programmer> programmers){
        return programmers.stream()
                .filter(programmer -> programmer.getLanguages().size() > 1)
                .collect(Collectors.toList());
    }
//        d) uzyskaj listę programistek, które piszą w Javie i Cpp
    public List<Programmer> famaleWhosWriteInJavaAndCpp(List<Programmer> programmers){
        return programmers.stream().filter(u -> !u.getPerson().isMale()).
                filter(u -> u.getLanguages().contains("Java") && u.getLanguages().contains("Cpp"))
                .collect(Collectors.toList());
    }

//        e) uzyskaj listę męskich imion

//    public List<String> getMaleNames(List<Programmer> programmers){
//        return programmers.stream()
//                .filter(u -> u.getPerson().isMale())
//                .map(u -> u.getPerson().getFirstName())
//                .collect(Collectors.toList());
//    }
    public Set<String> getMaleNames(List<Programmer> programmers){
        return programmers.stream()
                .filter(u -> u.getPerson().isMale())
                .map(u -> u.getPerson().getFirstName())
                .collect(Collectors.toSet());
    }
//        f) uzyskaj set wszystkich języków opanowanych przez programistów

//    public Set<String> setLanguages(List<Programmer> programmers){
//        List<List<String>> jezy = programmers.stream()
//                .map(p -> p.getLanguages())
//                .collect(Collectors.toList());
//
//        Set<String> jezyczki = new HashSet<>();
//        for (List<String> s:jezy){
//            s.stream()
//            .forEach(jezyk -> jezyczki.add(jezyk));
//        }
//
//        return jezyczki;
//    }

    public Set<String> setLanguages(List<Programmer> programmers){
        Set<String> languages = new HashSet<>();
        programmers.stream()
                .forEach(programmer -> programmer.getLanguages().stream()
                                                                    .forEach(language -> languages.add(language))
                );
        return languages;
    }



//    public Set<String> setLanguages(List<Programmer> programmers){
//        Set<String> languages = new HashSet<>();
//        programmers.stream()
//                .map(p -> p.getLanguages())
//                .map(l->l.stream()
//                        .forEach(language -> languages.add(language)));
////                .forEach(language -> jezyczki.add(language))
////                .collect(Collectors.toSet();
//
//        return languages;
//    }

//        g) uzyskaj listę nazwisk programistów, którzy znają więcej, niż dwa języki
    public List<String> lastNameMoreThenTwoLanguages(List<Programmer> programmers){
        return programmers.stream()
                .filter(programmer -> programmer.getLanguages().size() > 2)
                .map(programmer -> programmer.getPerson().getLastName())
                .collect(Collectors.toList());
    }

//        h) sprawdź, czy istnieje chociaż jedna osoba, która nie zna żadnego języka
    public boolean isExistAnyPersonWhosDoesnyKnowAnyLanguage(List<Programmer> programmers){
        return programmers.stream()
                .anyMatch(u -> u.getLanguages().size() == 0);
    }
//        i)* uzyskaj ilość wszystkich języków opanowanych przez programistki
//    public int programistyczki(List<Programmer> programmers){
//        Set<String> pro = programmers.stream()
//                .filter(programmer -> !programmer.getPerson().isMale())
//                .map(programmer -> programmer.getLanguages())
//                .collect(Collectors.toSet());
//    }

//        i)* uzyskaj ilość wszystkich języków opanowanych przez programistki
//    public int  getAllLanguagesKnownByFamales(List<Programmer> programmers){
//        return programmers.stream().filter(u -> !u.getPerson().isMale())
//                .mapToInt(u -> u.getLanguagesList().size()).sum();
//    }

}


