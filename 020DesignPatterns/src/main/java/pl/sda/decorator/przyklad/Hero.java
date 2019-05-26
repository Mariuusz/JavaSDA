package pl.sda.decorator.przyklad;


public class Hero implements IHero{
    private String name;
    private int hp, attackPoints, defencePoints;

    public Hero(String name) {
        this.name = name;
        this.attackPoints = 10;
        this.defencePoints = 5;
        this.hp = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefencePoints() {
        return defencePoints;
    }

    public void setDefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attackPoints=" + attackPoints +
                ", defencePoints=" + defencePoints +
                '}';
    }
}