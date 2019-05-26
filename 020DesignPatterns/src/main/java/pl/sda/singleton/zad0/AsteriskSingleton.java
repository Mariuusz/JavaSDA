package pl.sda.singleton.zad0;

import java.util.LinkedList;
import java.util.List;

public class AsteriskSingleton {
    private final static AsteriskSingleton instance = new AsteriskSingleton();

    private List<String> calls = new LinkedList<>();

    private AsteriskSingleton(){
    }

    public static AsteriskSingleton getInstance(){
        return instance;
    }

    public void call(){

    }

    public List<String> getCalls(){
        return calls;
    }
}