package pl.sda.decorator.przyklad;

public class HeroOnAHorse implements IHero {
    private Hero hero;

    private int additionalHealth = 20;
    private int additionalAttackPoints = 20;
    private int additionalDefencePoints = 20;

    public HeroOnAHorse(Hero hero) {
        this.hero = hero;
    }

    @Override
    public String getName() {
        return hero.getName() + " on a horse";
    }

    @Override
    public int getHp() {
        return hero.getHp() + additionalHealth;
    }

    @Override
    public int getAttackPoints() {
        return hero.getAttackPoints() + additionalAttackPoints;
    }

    @Override
    public int getDefencePoints() {
        return hero.getDefencePoints() + additionalDefencePoints;
    }

    @Override
    public String toString() {
        return "HeroOnAHorse{" +
                "hero=" + hero +
                ", additionalHealth=" + additionalHealth +
                ", additionalAttackPoints=" + additionalAttackPoints +
                ", additionalDefencePoints=" + additionalDefencePoints +
                '}';
    }
}