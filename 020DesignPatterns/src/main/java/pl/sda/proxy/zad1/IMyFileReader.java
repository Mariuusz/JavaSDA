package pl.sda.proxy.zad1;

import java.util.List;

public interface IMyFileReader {
    public List<String> wczytajNLinii(int ileLinii);
    public void pominNLinii(int ileLinii);
}