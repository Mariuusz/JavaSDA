package pl.sda.decorator.zad2;

public abstract class PizzeriaFactory {
    public static IPizza createPineapplePizza2(){
        return new SimplePizza(20, "PINEAPPLE", "HAM");
    }

    public static IPizza createPineapplePizza(){
        return new CustomPizza(new SimplePizza(), "PINEAPPLE", "HAM");
    }
}