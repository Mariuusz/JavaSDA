package pl.sda.zad4;

public class Numbers<T extends Number> {
    private T pierwszy;
    private T drugi;

    public Numbers(T pierwszy, T drugi) {
        this.pierwszy = pierwszy;
        this.drugi = drugi;
    }
    public <T extends Number> double suma(){
         return (int)pierwszy + (int)drugi;
    }
}
