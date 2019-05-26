package pl.sda.builder.zad1;

import java.util.Random;

public class GameCharacter {
    private String name;
    private int health;
    private int mana, numberOfPoints;

        public GameCharacter(Builder builder){
            name = builder.name;
            health = builder.health;
            mana = builder.mana;
            numberOfPoints = builder.numberOfPoints;

    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", health='" + health + '\'' +
                ", mana=" + mana +
                ", numberOfPoints=" + numberOfPoints +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public static class Builder {
        Random random = new Random();

        private String name = "Hero";
        private int mana = random.nextInt(99);
        private int health = random.nextInt(99);
        private int numberOfPoints = random.nextInt(1000);

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setHealth(int health) {
            this.health = health;
            return this;
        }

        public Builder setMana(int mana) {
            this.mana = mana;
            return this;
        }

        public Builder setNumberOfPoints(int numberOfPoints) {
            this.numberOfPoints = numberOfPoints;
            return this;
        }
        public GameCharacter create(){
            return new GameCharacter(this);
        }


    }

}
