package pl.sda.singleton.zad0;

import java.util.LinkedList;
import java.util.List;

public enum AsteriskSingletonEnum {
    instance;

    private List<String> calls = new LinkedList<>();

    public void call(){

    }

    public List<String> getCalls(){
        return calls;
    }
}