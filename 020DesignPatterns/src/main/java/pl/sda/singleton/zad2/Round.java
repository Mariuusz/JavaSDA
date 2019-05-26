package pl.sda.singleton.zad2;
import java.util.Random;

public class Round {
    private int no1, no2;
    private char sign;

    public Round() {
        no1 = new Random().nextInt(MySettings.INSTANCE.getRange1());
        no2 = new Random().nextInt(MySettings.INSTANCE.getRange2());
        int singnsSize = MySettings.INSTANCE.getSigns().length();
        sign = MySettings.INSTANCE.getSigns().charAt(new Random().nextInt(singnsSize));
    }

    public boolean validate(int userResult) {
        if (sign == '+') {
            return (no1 + no2) == userResult;
        } else if (sign == '-') {
            return (no1 - no2) == userResult;
        } else if (sign == '*') {
            return (no1 * no2) == userResult;
        } else if (sign == '/') {
            return (no1 / no2) == userResult;
        }
        return false;
    }

    public int getNo1() {
        return no1;
    }

    public void setNo1(int no1) {
        this.no1 = no1;
    }

    public int getNo2() {
        return no2;
    }

    public void setNo2(int no2) {
        this.no2 = no2;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "Round{" +
                "no1=" + no1 +
                ", no2=" + no2 +
                ", sign=" + sign +
                '}';
    }
}