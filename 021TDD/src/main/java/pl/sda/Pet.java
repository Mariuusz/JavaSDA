package pl.sda;

public class Pet {
    private String name;
    private double weight;
    private double height;
    private int age;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(double amountOfFood){
        this.weight += amountOfFood;
    }

    public double getBMI(){
        if (this.height<=0){
            throw new IllegalStateException("Height can't be less  or equal 0");
        }
        if (this.weight <= 0){
            throw new IllegalStateException("Weight can't be less  or equal 0");
        }

        return this.weight/(this.height*this.height);

//    public double feed(double food){
//        return this.weight + food;
//        }
//        if (getHeight()<0){
//            throw IllegalStateException;
//        }
        //return getWeight() / (getHeight() * getHeight());
    }
}
