package pl.sda.str28_Wyjątki;

public class InsufficientFoundsException extends Exception {

    public InsufficientFoundsException(){
        super("Za mało środków");
    }
}
